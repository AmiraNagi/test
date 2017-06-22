package vis.csm.response.api;

public class Individual {

	private String name;
	
	private String first_name;
	
	private String middle_name;
	
	private String middle_initial;
	
	private String family_name;
	
	private String formatted_name;
	
	private String tariff_name;
	
	private String account_number;
	
	private String subscriber_id;
	
	private String account_type;
	
	private String billCycle;
	
	private BillStatus billStatus;
	
	private String msisdn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getMiddle_initial() {
		return middle_initial;
	}

	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFormatted_name() {
		return formatted_name;
	}

	public void setFormatted_name(String formatted_name) {
		this.formatted_name = formatted_name;
	}

	public String getTariff_name() {
		return tariff_name;
	}

	public void setTariff_name(String tariff_name) {
		this.tariff_name = tariff_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getSubscriber_id() {
		return subscriber_id;
	}

	public void setSubscriber_id(String subscriber_id) {
		this.subscriber_id = subscriber_id;
	}

	@Override
	public String toString() {
		return "Individual [name=" + name + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", middle_initial=" + middle_initial + ", family_name=" + family_name + ", formatted_name="
				+ formatted_name + ", tariff_name=" + tariff_name + ", account_number=" + account_number
				+ ", subscriber_id=" + subscriber_id + "]";
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

	public BillStatus getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	

}