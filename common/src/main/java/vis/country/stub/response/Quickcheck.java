package vis.country.stub.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Quickcheck implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<PackageGroup>  packageGroup;

	private ChargeGroup[] chargeGroup;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd.MM.yyyy")
	private Date billDate;

	private String sum;

	private String currency;

	public List<PackageGroup> getPackageGroup() {
		return packageGroup;
	}

	public void setPackageGroup(List<PackageGroup> packageGroup) {
		this.packageGroup = packageGroup;
	}

	public ChargeGroup[] getChargeGroup() {
		return chargeGroup;
	}

	public void setChargeGroup(ChargeGroup[] chargeGroup) {
		this.chargeGroup = chargeGroup;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "ClassPojo [packageGroup = " + packageGroup + ", chargeGroup = " + chargeGroup + ", billDate = "
				+ billDate + ", sum = " + sum + ", currency = " + currency + "]";
	}
}
