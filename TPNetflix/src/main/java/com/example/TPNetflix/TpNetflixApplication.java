package com.example.TPNetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TpNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpNetflixApplication.class, args);
	}

}
