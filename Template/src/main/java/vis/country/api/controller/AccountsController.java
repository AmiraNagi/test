package vis.country.api.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vis.country.api.service.CustomerPartyService;
import vis.csm.response.api.CustomerParty;

@RestController
@RequestMapping("/country")
public class AccountsController {

	protected Logger logger = Logger.getLogger(AccountsController.class.getName());

	@Autowired
	private CustomerPartyService customerPartyService;

	@RequestMapping(value = "/custparty", produces = "application/json")
	public ResponseEntity<CustomerParty> getProfile(@RequestHeader(value = "msisdn") String msisdn) throws Exception{
		logger.info("select all accounts");
		CustomerParty customerParty = null;
		logger.info("GERMANY MSISDN ---> "+msisdn);
		customerParty = customerPartyService.getGermanySummarizedProfile(msisdn);
		return new ResponseEntity<CustomerParty>(customerParty, HttpStatus.OK);
	}

}
