package vis.db.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cassandra.config.DataCenterReplication;
import org.springframework.cassandra.core.keyspace.CreateKeyspaceSpecification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraEntityClassScanner;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.convert.CassandraConverter;
import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "vis.country.api.repositories")
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Override
	protected String getKeyspaceName() {
		return "dsl";
	}

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}

	@Override
	@Bean
	public CassandraSessionFactoryBean session() {
		try {
			CassandraSessionFactoryBean bean = new CassandraSessionFactoryBean();
			bean.setCluster(cluster().getObject());
			bean.setConverter(converter());
			bean.setSchemaAction(getSchemaAction());
			bean.setKeyspaceName(getKeyspaceName());
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Bean
	public CassandraConverter converter() throws Exception {
		return new MappingCassandraConverter(mappingContext());
	}

	@Bean
	public CassandraMappingContext mappingContext() throws Exception {
		BasicCassandraMappingContext bean = new BasicCassandraMappingContext();
		bean.setInitialEntitySet(CassandraEntityClassScanner.scan(("vis.country.api.entities")));
		return bean;
	}

	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setKeyspaceCreations(getKeyspaceCreations());
		cluster.setContactPoints("10.0.4.10");
		cluster.setPort(9160);
		return cluster;
	}

	protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
		List<CreateKeyspaceSpecification> createKeyspaceSpecifications = new ArrayList<CreateKeyspaceSpecification>();
		createKeyspaceSpecifications.add(getKeySpaceSpecification());
		return createKeyspaceSpecifications;
	}

	// Below method creates "my_keyspace" if it doesnt exist.
	private CreateKeyspaceSpecification getKeySpaceSpecification() {
		CreateKeyspaceSpecification pandaCoopKeyspace = new CreateKeyspaceSpecification();
		DataCenterReplication dcr = new DataCenterReplication("dc1", 3L);
		pandaCoopKeyspace.name("dsl");
		pandaCoopKeyspace.ifNotExists(true).createKeyspace().withNetworkReplication(dcr);
		return pandaCoopKeyspace;
	}

}