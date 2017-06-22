package vis.country.stub.response;

import java.io.Serializable;

public class DetailedProfile implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String[] ldapSocs;

	private String[] bookableSpeedbuckets;

	private Quickcheck quickcheck;

	private String version;

	public String[] getLdapSocs() {
		return ldapSocs;
	}

	public void setLdapSocs(String[] ldapSocs) {
		this.ldapSocs = ldapSocs;
	}

	public String[] getBookableSpeedbuckets() {
		return bookableSpeedbuckets;
	}

	public void setBookableSpeedbuckets(String[] bookableSpeedbuckets) {
		this.bookableSpeedbuckets = bookableSpeedbuckets;
	}

	public Quickcheck getQuickcheck() {
		return quickcheck;
	}

	public void setQuickcheck(Quickcheck quickcheck) {
		this.quickcheck = quickcheck;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ClassPojo [ldapSocs = " + ldapSocs + ", bookableSpeedbuckets = " + bookableSpeedbuckets
				+ ", quickcheck = " + quickcheck + ", version = " + version + "]";
	}
}
