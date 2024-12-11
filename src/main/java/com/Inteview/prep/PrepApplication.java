package com.Inteview.prep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* With main class we are using this annotation
* 	It combines @Configuration, @EnableAutoConfiguration and @ComponentScan
* 	@Configuration : It marks the class as source of bean definitions.
* 	@EnableAutoConfigurations : Enables spring boots autoconfiguration feature.
*			How autoconfiguration achieves :
* 				using @EnableAutoConfiguration which automatically configures beans based on the classpath dependencies and setting in
* 				application.properties or application.yaml.
* 				It uses @conditional annotation to apply configurations only when certain conditions are met.
* */
@SpringBootApplication
public class PrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrepApplication.class, args);
	}

}
