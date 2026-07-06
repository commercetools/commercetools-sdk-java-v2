package com.commercetools.sdk.examples.springmvc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "ctp.client.id=test-client-id",
        "ctp.client.secret=test-client-secret",
        "ctp.project.key=test-project-key"
})
class SpringmvcApplicationTests {

	@Test
	void contextLoads() {
	}

}
