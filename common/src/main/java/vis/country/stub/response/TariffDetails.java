package vis.country.stub.response;

public class TariffDetails {
	
	private Sepia sepia;

	private Vfssdublin vfssdublin;

	public Sepia getSepia() {
		return sepia;
	}

	public void setSepia(Sepia sepia) {
		this.sepia = sepia;
	}

	public Vfssdublin getVfssdublin() {
		return vfssdublin;
	}

	public void setVfssdublin(Vfssdublin vfssdublin) {
		this.vfssdublin = vfssdublin;
	}

	@Override
	public String toString() {
		return "ClassPojo [sepia = " + sepia + ", vfssdublin = " + vfssdublin + "]";
	}
}
