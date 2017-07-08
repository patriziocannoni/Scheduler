package br.com.cannoni.scheduler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * @author patrizio
 * @since 30/06/2017
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class Application {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(false).run(args);
	}

}
