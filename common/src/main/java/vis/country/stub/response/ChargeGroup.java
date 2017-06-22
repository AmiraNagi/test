package vis.country.stub.response;

public class ChargeGroup {
	private Charge[] charge;

	private String description;

	public Charge[] getCharge() {
		return charge;
	}

	public void setCharge(Charge[] charge) {
		this.charge = charge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ClassPojo [charge = " + charge + ", description = " + description + "]";
	}
}

