package com.mobious.dsa;

import com.mobious.dsa.algorithms.InsertionSortAlgorithm;

public class TestApplication {

	public static void main(String[] args) {
		int[] result = InsertionSortAlgorithm.insertionSort(new int[]{10,5,3,13,52,5,42,4});
		printArray(result);
	}
	
	
	private static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		
	}
}
