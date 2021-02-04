package com.example.sort;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgo{

	public int[] sort(int[] array) {
	
		System.out.println("BubbleSort");
		return array;
	}
	
}
