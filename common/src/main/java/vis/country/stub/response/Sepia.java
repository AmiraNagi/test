package vis.country.stub.response;

public class Sepia {
	
	private String[] discounts;

	private Tariff tariff;

	private Options[] options;

	public String[] getDiscounts() {
		return discounts;
	}

	public void setDiscounts(String[] discounts) {
		this.discounts = discounts;
	}

	public Tariff getTariff() {
		return tariff;
	}

	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}

	public Options[] getOptions() {
		return options;
	}

	public void setOptions(Options[] options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "ClassPojo [discounts = " + discounts + ", tariff = " + tariff + ", options = " + options + "]";
	}
}
