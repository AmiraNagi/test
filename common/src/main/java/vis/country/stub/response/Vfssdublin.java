package vis.country.stub.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vfssdublin {
	
	private String nextSubsidyDate;

	@JsonProperty("NEYInlifeButtonLink")
	private String NEYInlifeButtonLink;

	private String nextCancellationDate;

	@JsonProperty("NEYInlive")
	private String NEYInlive;

	@JsonProperty("NEYInlifeButtonText")
	private String NEYInlifeButtonText;

	private String lastSubsidyDate;

	private String inlifeNEYSOCEndDate;

	private String contractEndDate;

	private String cancellationDate;

	private String currentContractEndDate;

	private String hasActiveARP;

	private String originalContractEndDate;

	private String prolongationType;

	private String eligibilityStatus;

	@JsonProperty("NEYInlifeDate")
	private String NEYInlifeDate;

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

	public String getNextCancellationDate() {
		return nextCancellationDate;
	}

	public void setNextCancellationDate(String nextCancellationDate) {
		this.nextCancellationDate = nextCancellationDate;
	}

	public String getNEYInlive() {
		return NEYInlive;
	}

	public void setNEYInlive(String NEYInlive) {
		this.NEYInlive = NEYInlive;
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

	public String getInlifeNEYSOCEndDate() {
		return inlifeNEYSOCEndDate;
	}

	public void setInlifeNEYSOCEndDate(String inlifeNEYSOCEndDate) {
		this.inlifeNEYSOCEndDate = inlifeNEYSOCEndDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
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
		return "ClassPojo [nextSubsidyDate = " + nextSubsidyDate + ", NEYInlifeButtonLink = " + NEYInlifeButtonLink
				+ ", nextCancellationDate = " + nextCancellationDate + ", NEYInlive = " + NEYInlive
				+ ", NEYInlifeButtonText = " + NEYInlifeButtonText + ", lastSubsidyDate = " + lastSubsidyDate
				+ ", inlifeNEYSOCEndDate = " + inlifeNEYSOCEndDate + ", contractEndDate = " + contractEndDate
				+ ", cancellationDate = " + cancellationDate + ", currentContractEndDate = " + currentContractEndDate
				+ ", hasActiveARP = " + hasActiveARP + ", originalContractEndDate = " + originalContractEndDate
				+ ", prolongationType = " + prolongationType + ", eligibilityStatus = " + eligibilityStatus
				+ ", NEYInlifeDate = " + NEYInlifeDate + "]";
	}
}
