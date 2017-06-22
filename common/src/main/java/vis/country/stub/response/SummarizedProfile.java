package vis.country.stub.response;

import java.io.Serializable;

public class SummarizedProfile implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String ban;

	private String[] ldapSocs;

	private String hasJLPromoSoc;

	private String customerPasswordNeeded;

	private String msisdn;

	private String surName;

	private String vfagreementref;

	private String givenName;

	private String hasPersonalAgent;

	private String vfmmodatagroupname;

	private String vfmmodatagroupid;

	private String version;

	private String vfplan;

	private String msisdnsInDataGroup;

	private String hasOnlineBill;

	private String accounttype;

	private String dataGroupOwnerMsisdn;

	private String marketCode;

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String[] getLdapSocs() {
		return ldapSocs;
	}

	public void setLdapSocs(String[] ldapSocs) {
		this.ldapSocs = ldapSocs;
	}

	public String getHasJLPromoSoc() {
		return hasJLPromoSoc;
	}

	public void setHasJLPromoSoc(String hasJLPromoSoc) {
		this.hasJLPromoSoc = hasJLPromoSoc;
	}

	public String getCustomerPasswordNeeded() {
		return customerPasswordNeeded;
	}

	public void setCustomerPasswordNeeded(String customerPasswordNeeded) {
		this.customerPasswordNeeded = customerPasswordNeeded;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getVfagreementref() {
		return vfagreementref;
	}

	public void setVfagreementref(String vfagreementref) {
		this.vfagreementref = vfagreementref;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getHasPersonalAgent() {
		return hasPersonalAgent;
	}

	public void setHasPersonalAgent(String hasPersonalAgent) {
		this.hasPersonalAgent = hasPersonalAgent;
	}

	public String getVfmmodatagroupname() {
		return vfmmodatagroupname;
	}

	public void setVfmmodatagroupname(String vfmmodatagroupname) {
		this.vfmmodatagroupname = vfmmodatagroupname;
	}

	public String getVfmmodatagroupid() {
		return vfmmodatagroupid;
	}

	public void setVfmmodatagroupid(String vfmmodatagroupid) {
		this.vfmmodatagroupid = vfmmodatagroupid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVfplan() {
		return vfplan;
	}

	public void setVfplan(String vfplan) {
		this.vfplan = vfplan;
	}

	public String getMsisdnsInDataGroup() {
		return msisdnsInDataGroup;
	}

	public void setMsisdnsInDataGroup(String msisdnsInDataGroup) {
		this.msisdnsInDataGroup = msisdnsInDataGroup;
	}

	public String getHasOnlineBill() {
		return hasOnlineBill;
	}

	public void setHasOnlineBill(String hasOnlineBill) {
		this.hasOnlineBill = hasOnlineBill;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getDataGroupOwnerMsisdn() {
		return dataGroupOwnerMsisdn;
	}

	public void setDataGroupOwnerMsisdn(String dataGroupOwnerMsisdn) {
		this.dataGroupOwnerMsisdn = dataGroupOwnerMsisdn;
	}

	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	@Override
	public String toString() {
		return "CustomerProfile [ban = " + ban + ", ldapSocs = " + ldapSocs + ", hasJLPromoSoc = " + hasJLPromoSoc
				+ ", customerPasswordNeeded = " + customerPasswordNeeded + ", msisdn = " + msisdn + ", surName = "
				+ surName + ", vfagreementref = " + vfagreementref + ", givenName = " + givenName
				+ ", hasPersonalAgent = " + hasPersonalAgent + ", vfmmodatagroupname = " + vfmmodatagroupname
				+ ", vfmmodatagroupid = " + vfmmodatagroupid + ", version = " + version + ", vfplan = " + vfplan
				+ ", msisdnsInDataGroup = " + msisdnsInDataGroup + ", hasOnlineBill = " + hasOnlineBill
				+ ", accounttype = " + accounttype + ", dataGroupOwnerMsisdn = " + dataGroupOwnerMsisdn
				+ ", marketCode = " + marketCode + "]";
	}
}