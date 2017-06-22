package vis.country.stub.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackageGroup implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String description;

	@JsonProperty("package")
	private List<PackageItem> packages;

	private String type;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PackageItem> getPackages() {
		return packages;
	}

	public void setPackages(List<PackageItem> packages) {
		this.packages = packages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [description = " + description + ", packages = " + packages + ", type = " + type + "]";
	}
}