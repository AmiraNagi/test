package vis.country.stub.response;

public class Tariff {
	
	private String price;

	private String description;

	private String htmlDescription;

	private String code;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ClassPojo [price = " + price + ", description = " + description + ", htmlDescription = "
				+ htmlDescription + ", code = " + code + "]";
	}
}