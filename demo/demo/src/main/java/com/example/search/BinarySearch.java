package com.example.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.sort.SortingAlgo;

@Component
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	private SortingAlgo sortAlgo;
	
	public int  search(int[] array){
		sortAlgo.sort(array);
		return 5;
	}
}
