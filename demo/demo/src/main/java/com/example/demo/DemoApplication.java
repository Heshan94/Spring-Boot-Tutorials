package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.search.BinarySearch;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		BinarySearch bs = applicationContext.getBean(BinarySearch.class);
//		BinarySearch bs = new BinarySearch(new QuickSort());
		int temp= bs.search(new int[] {1,2,4,5});
		System.out.println(temp);
		
	}

}
