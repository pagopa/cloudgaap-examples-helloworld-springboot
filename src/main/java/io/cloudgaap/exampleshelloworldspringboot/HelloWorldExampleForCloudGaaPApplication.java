package io.cloudgaap.exampleshelloworldspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldExampleForCloudGaaPApplication {

	public static void main(String[] args) {
		// Alternative way to set server properties from environment variables
		// System.setProperty("server.port", System.getenv("PORT"));
		// System.setProperty("server.servlet.context-path", System.getenv("CGAAP_BASE_PATH"));
		SpringApplication.run(HelloWorldExampleForCloudGaaPApplication.class, args);
	}

}
