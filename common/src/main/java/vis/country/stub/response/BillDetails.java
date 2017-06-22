package vis.country.stub.response;

import java.util.List;

public class BillDetails {
	
	private String result;

	private List<DocumentList> documentList;

	private CbmwsiStatus cbmwsiStatus;

	private String documentRetrievalPrefix;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<DocumentList> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<DocumentList> documentList) {
		this.documentList = documentList;
	}

	public CbmwsiStatus getCbmwsiStatus() {
		return cbmwsiStatus;
	}

	public void setCbmwsiStatus(CbmwsiStatus cbmwsiStatus) {
		this.cbmwsiStatus = cbmwsiStatus;
	}

	public String getDocumentRetrievalPrefix() {
		return documentRetrievalPrefix;
	}

	public void setDocumentRetrievalPrefix(String documentRetrievalPrefix) {
		this.documentRetrievalPrefix = documentRetrievalPrefix;
	}

	@Override
	public String toString() {
		return "ClassPojo [result = " + result + ", documentList = " + documentList + ", cbmwsiStatus = " + cbmwsiStatus
				+ ", documentRetrievalPrefix = " + documentRetrievalPrefix + "]";
	}
}
