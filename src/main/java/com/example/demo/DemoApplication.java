// package com.example.demo;

// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
// import org.springframework.boot.web.client.RestTemplateBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

// import ch.qos.logback.classic.Logger;



// import org.springframework.stereotype.*;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DemoApplication {

//   private static final Logger log = (Logger) LoggerFactory.getLogger(DemoApplication.class);
// public static void main(String[] args) {
// SpringApplication.run(DemoApplication.class, args);
// // SpringApplication.run(Application.class, args);
// //
// @Bean
// public RestTemplate restTemplate(RestTemplateBuilder builder) {
//   return builder.build();
// }
// //
// @Bean
// 	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
// 		return args -> {
// 			Quote quote = restTemplate.getForObject(
// 					"https://quoters.apps.pcfone.io/api/random", Quote.class);
// 			log.info(quote.toString());
// 		};
// 	}

  
  
// }

// @GetMapping("/hello")
// public String helloB(@RequestParam(value = "name", defaultValue = "World") String name) {
    
// return String.format("Hello %s!", name);

// }




// }


package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}