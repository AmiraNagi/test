package vis.csm.response.api;

public class BillStatus {
	
	private String unpaidAmount;
	private String count;
	private String currency;
	private String daysLeft;
	
	public String getUnpaidAmount() {
		return unpaidAmount;
	}
	public void setUnpaidAmount(String unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(String daysLeft) {
		this.daysLeft = daysLeft;
	}

}
