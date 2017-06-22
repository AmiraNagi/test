package vis.csm.response.api;

public class Parts {

	private Individual individual;

	public Individual getIndividual() {
		return individual;
	}

	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

	@Override
	public String toString() {
		return "ClassPojo [individual = " + individual + "]";
	}
}