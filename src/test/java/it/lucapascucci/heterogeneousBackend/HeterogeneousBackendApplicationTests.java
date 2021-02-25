package it.lucapascucci.heterogeneousBackend;

import it.lucapascucci.heterogeneousBackend.rest.GreetingRestAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HeterogeneousBackendApplicationTests {

	// TODO https://www.baeldung.com/spring-mock-rest-template

	@Autowired
	private GreetingRestAPI greetingRestAPI;

	@Test
	void contextLoads() {
		assertThat(greetingRestAPI).isNotNull();
	}

}
