package vis.country.stub.response;

import java.io.Serializable;

public class PackageItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String timestamp;

	private String total;

	private String unit;

	private String description;

	private String used;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	@Override
	public String toString() {
		return "ClassPojo [timestamp = " + timestamp + ", total = " + total + ", unit = " + unit + ", description = "
				+ description + ", used = " + used + "]";
	}
}