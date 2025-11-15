package com.paymentchain.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(
	webEnvironment = SpringBootTest.WebEnvironment.NONE,
	properties = {
		"spring.cloud.config.server.git.clone-on-start=false",
		"eureka.client.enabled=false",
		"spring.cloud.config.enabled=false"
	}
)
@ActiveProfiles("test")
class ConfigserverApplicationTests {

	@Test
	void contextLoads() {
		// Test passes if Spring context loads successfully
	}

}
