package edu.eci.ieti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class IetiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(IetiApplication.class, args);
		SpringApplication app = new SpringApplication(IetiApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
		app.run(args);
	}
	/**
	 * Optiene puerto del entorno.
	 * @return port del entorno
	 */
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 8080; //returns default port if heroku-port isn't set (i.e. on localhost)
	}
}
