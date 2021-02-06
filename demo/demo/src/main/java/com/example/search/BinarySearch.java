package com.example.search;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.sort.SortingAlgo;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	private SortingAlgo sortAlgo;
	
	public int  search(int[] array){
		sortAlgo.sort(array);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("Post Construct");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Pre Destroy");
	}
}
