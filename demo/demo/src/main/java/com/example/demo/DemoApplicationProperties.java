package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.properties.SomeExternalService;
import com.example.search.BinarySearch;

@SpringBootApplication
@PropertySource("classpath:app.properties")

public class DemoApplicationProperties {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplicationProperties.class, args);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		System.out.println(service.getUrl());
		
	}

}
