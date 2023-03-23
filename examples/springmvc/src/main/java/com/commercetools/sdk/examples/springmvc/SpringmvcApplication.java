package com.commercetools.sdk.examples.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringmvcApplication {

    public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

}
