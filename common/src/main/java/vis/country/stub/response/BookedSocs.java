package vis.country.stub.response;

public class BookedSocs {
	
	private String cancellationDate;
	
	private String expiryDate;

	private String description;

	private String removable;

	private String link;

	private String linkMod;

	private String code;

	private String group;

	private String prio;

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemovable() {
		return removable;
	}

	public void setRemovable(String removable) {
		this.removable = removable;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLinkMod() {
		return linkMod;
	}

	public void setLinkMod(String linkMod) {
		this.linkMod = linkMod;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPrio() {
		return prio;
	}

	public void setPrio(String prio) {
		this.prio = prio;
	}

	@Override
	public String toString() {
		return "ClassPojo [cancellationDate = " + cancellationDate + ", description = " + description + ", removable = "
				+ removable + ", link = " + link + ", linkMod = " + linkMod + ", code = " + code + ", group = " + group
				+ ", prio = " + prio + "]";
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}