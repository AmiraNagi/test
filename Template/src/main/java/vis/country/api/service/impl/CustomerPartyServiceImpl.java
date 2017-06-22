package vis.country.api.service.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vis.common.aspect.annotations.AspectLoggable;
import vis.common.utils.HTTPRequestUtil;
import vis.country.api.repositories.LookupRepository;
import vis.country.api.service.CustomerPartyService;
import vis.country.stub.response.DetailedProfile;
import vis.country.stub.response.SummarizedProfile;
import vis.csm.response.api.BillStatus;
import vis.csm.response.api.CustomerParty;
import vis.csm.response.api.Individual;

@Service
public class CustomerPartyServiceImpl implements CustomerPartyService {

	@Autowired
	private LookupRepository lookupRepository;
	
	@Override
	@AspectLoggable
	public CustomerParty getGermanySummarizedProfile(String msisdn) throws Exception{
		String url1 = lookupRepository.findByKey("de.cust.party.url").getUrl();
		String url2 = lookupRepository.findByKey("de.usage.url").getUrl();
		SummarizedProfile summarized = HTTPRequestUtil.parseGermanySummarizedProfile(msisdn, url1);
		DetailedProfile detailed = HTTPRequestUtil.parseGermanyDetailedProfile(msisdn, url2);
		return fillGermanyCustParty(summarized, detailed);

	}

	private CustomerParty fillGermanyCustParty(SummarizedProfile summarized, DetailedProfile detailed) throws Exception {

		CustomerParty custParty = new CustomerParty();
		
		try{
			vis.csm.response.api.Parts parts = new vis.csm.response.api.Parts();
			Individual individual = new Individual();
			individual.setName(summarized.getGivenName());
			individual.setFamily_name(summarized.getSurName());
			individual.setTariff_name(summarized.getVfplan());
			individual.setAccount_type(summarized.getAccounttype());
			individual.setMsisdn(summarized.getMsisdn());
	
			BillStatus billStatus = new BillStatus();
	
			Calendar cal = Calendar.getInstance();
			Calendar current = Calendar.getInstance();
			int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			cal.setTime(detailed.getQuickcheck().getBillDate());
			cal.add(Calendar.DAY_OF_MONTH, lastDayOfMonth);
			cal.add(Calendar.DAY_OF_MONTH, -1);
	
			billStatus.setDaysLeft(daysBetween(current.getTime(), cal.getTime()));
	
			individual.setBillStatus(billStatus);
			parts.setIndividual(individual);
			custParty.setParts(parts);
			
		} /*handle business exceptions here */ catch(Exception e){
			throw e;
		}
		
		return custParty;
	}

	private String daysBetween(Date d1, Date d2) {
		return String.valueOf((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
}