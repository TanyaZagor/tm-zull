package ru.zagorodnikova.tm.tmzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableEurekaClient
@EnableZuulProxy
public class TmZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmZullApplication.class, args);
	}

}
