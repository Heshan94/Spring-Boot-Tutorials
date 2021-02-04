package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.jdbc.PersonDao;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplicationJdbc {

	private static Logger logger =  LoggerFactory.getLogger(DemoApplicationJdbc.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplicationJdbc.class, args);
		
		PersonDao person = applicationContext.getBean(PersonDao.class);
		PersonDao person1 = applicationContext.getBean(PersonDao.class);
		
		logger.info("{}",person);
		logger.info("{}",person1);
		logger.info("{}", person.getJdbc());
		logger.info("{}", person.getJdbc());
		logger.info("{}", person1.getJdbc());
		
	}

}
