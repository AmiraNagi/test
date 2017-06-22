package vis.country.api.repositories;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import vis.country.api.entities.Lookup;

@Repository
public interface LookupRepository extends CassandraRepository<Lookup> {
	
	@Cacheable(key="msisdn" ,value="profile")	
	Lookup findByKey(String key);
	
}