package com.example.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortingAlgo{

	public int[] sort(int[] array) {
	
		System.out.println("BubbleSort");
		return array;
	}
	
}
