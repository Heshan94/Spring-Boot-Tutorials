package com.example.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortingAlgo{

	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort");
		return array;
	}

}
