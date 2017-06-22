package vis.country.stub.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DocumentList {
	
	private String ban;

	private String documentType;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMdd")
	private Date billDate;

	private String documentId;

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	@Override
	public String toString() {
		return "ClassPojo [ban = " + ban + ", documentType = " + documentType + ", billDate = " + billDate
				+ ", documentId = " + documentId + "]";
	}
}
