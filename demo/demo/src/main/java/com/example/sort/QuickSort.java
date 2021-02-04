package com.example.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgo{

	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort");
		return array;
	}

}
