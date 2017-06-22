package vis.country.api.service;

import vis.csm.response.api.CustomerParty;

public interface CustomerPartyService {

	public  CustomerParty getGermanySummarizedProfile(String msisdn) throws Exception;
	
}