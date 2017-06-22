package vis.country.stub.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerTariff {
	
	private BookedSocs[] bookedSocs;

	private BookableSocs[] bookableSocs;

	private String nextSubsidyDate;

	@JsonProperty("NEYInlifeButtonLink")
	private String NEYInlifeButtonLink;

	private String inlifeNEY_SOC_EndDate;

	private String nextCancellationDate;

	private String tariffOption;

	@JsonProperty("NEYInlifeButtonText")
	private String NEYInlifeButtonText;

	private String lastSubsidyDate;

	private String version;

	private String cancellationDate;

	private String contractEndDate;

	private String currentContractEndDate;

	private String hasActiveARP;

	private String originalContractEndDate;

	private String prolongationType;

	@JsonProperty("NEY-Inlife")
	private String NEY_Inlife;

	private String eligibilityStatus;

	@JsonProperty("NEYInlifeDate")
	private String NEYInlifeDate;

	public BookedSocs[] getBookedSocs() {
		return bookedSocs;
	}

	public void setBookedSocs(BookedSocs[] bookedSocs) {
		this.bookedSocs = bookedSocs;
	}

	public BookableSocs[] getBookableSocs() {
		return bookableSocs;
	}

	public void setBookableSocs(BookableSocs[] bookableSocs) {
		this.bookableSocs = bookableSocs;
	}

	public String getNextSubsidyDate() {
		return nextSubsidyDate;
	}

	public void setNextSubsidyDate(String nextSubsidyDate) {
		this.nextSubsidyDate = nextSubsidyDate;
	}

	public String getNEYInlifeButtonLink() {
		return NEYInlifeButtonLink;
	}

	public void setNEYInlifeButtonLink(String NEYInlifeButtonLink) {
		this.NEYInlifeButtonLink = NEYInlifeButtonLink;
	}

	public String getInlifeNEY_SOC_EndDate() {
		return inlifeNEY_SOC_EndDate;
	}

	public void setInlifeNEY_SOC_EndDate(String inlifeNEY_SOC_EndDate) {
		this.inlifeNEY_SOC_EndDate = inlifeNEY_SOC_EndDate;
	}

	public String getNextCancellationDate() {
		return nextCancellationDate;
	}

	public void setNextCancellationDate(String nextCancellationDate) {
		this.nextCancellationDate = nextCancellationDate;
	}

	public String getTariffOption() {
		return tariffOption;
	}

	public void setTariffOption(String tariffOption) {
		this.tariffOption = tariffOption;
	}

	public String getNEYInlifeButtonText() {
		return NEYInlifeButtonText;
	}

	public void setNEYInlifeButtonText(String NEYInlifeButtonText) {
		this.NEYInlifeButtonText = NEYInlifeButtonText;
	}

	public String getLastSubsidyDate() {
		return lastSubsidyDate;
	}

	public void setLastSubsidyDate(String lastSubsidyDate) {
		this.lastSubsidyDate = lastSubsidyDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getCurrentContractEndDate() {
		return currentContractEndDate;
	}

	public void setCurrentContractEndDate(String currentContractEndDate) {
		this.currentContractEndDate = currentContractEndDate;
	}

	public String getHasActiveARP() {
		return hasActiveARP;
	}

	public void setHasActiveARP(String hasActiveARP) {
		this.hasActiveARP = hasActiveARP;
	}

	public String getOriginalContractEndDate() {
		return originalContractEndDate;
	}

	public void setOriginalContractEndDate(String originalContractEndDate) {
		this.originalContractEndDate = originalContractEndDate;
	}

	public String getProlongationType() {
		return prolongationType;
	}

	public void setProlongationType(String prolongationType) {
		this.prolongationType = prolongationType;
	}


	public String getEligibilityStatus() {
		return eligibilityStatus;
	}

	public void setEligibilityStatus(String eligibilityStatus) {
		this.eligibilityStatus = eligibilityStatus;
	}

	public String getNEYInlifeDate() {
		return NEYInlifeDate;
	}

	public void setNEYInlifeDate(String NEYInlifeDate) {
		this.NEYInlifeDate = NEYInlifeDate;
	}

	@Override
	public String toString() {
		return "ClassPojo [bookedSocs = " + bookedSocs + ", bookableSocs = " + bookableSocs + ", nextSubsidyDate = "
				+ nextSubsidyDate + ", NEYInlifeButtonLink = " + NEYInlifeButtonLink + ", inlifeNEY_SOC_EndDate = "
				+ inlifeNEY_SOC_EndDate + ", nextCancellationDate = " + nextCancellationDate + ", tariffOption = "
				+ tariffOption + ", NEYInlifeButtonText = " + NEYInlifeButtonText + ", lastSubsidyDate = "
				+ lastSubsidyDate + ", version = " + version + ", cancellationDate = " + cancellationDate
				+ ", contractEndDate = " + contractEndDate + ", currentContractEndDate = " + currentContractEndDate
				+ ", hasActiveARP = " + hasActiveARP + ", originalContractEndDate = " + originalContractEndDate
				+ ", prolongationType = " + prolongationType + ", NEY_Inlife = " + NEY_Inlife
				+ ", eligibilityStatus = " + eligibilityStatus + ", NEYInlifeDate = " + NEYInlifeDate + "]";
	}

	public String getNEY_Inlife() {
		return NEY_Inlife;
	}

	public void setNEY_Inlife(String nEY_Inlife) {
		NEY_Inlife = nEY_Inlife;
	}
}