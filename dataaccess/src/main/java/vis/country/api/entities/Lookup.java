package vis.country.api.entities;
 
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table("Lookup")
public class Lookup {

	@PrimaryKeyColumn(name = "key", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String key;
	private String url;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}



}
