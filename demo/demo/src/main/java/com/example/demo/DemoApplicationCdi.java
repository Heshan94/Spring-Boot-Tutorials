package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.cdi.SomeCdiBusiness;
import com.example.search.BinarySearch;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplicationCdi {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplicationCdi.class, args);
		
		SomeCdiBusiness cdi = applicationContext.getBean(SomeCdiBusiness.class);
		System.out.println(cdi.getDao());
	}

}
