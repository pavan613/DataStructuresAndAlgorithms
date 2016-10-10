package com.mobious.dsa.algorithms;

public class InsertionSortAlgorithm {
	
public static int[] insertionSort(int[] array){
		
		if(array.length==1){
			return array;
		}	
		else{
			int valueToInsert;
			int positionToInsert;
			for(int i=1;i<array.length;i++){
				valueToInsert=array[i];
				positionToInsert=i-1;
				while (positionToInsert>=0 && array[positionToInsert]>valueToInsert){
					array[positionToInsert+1]=array[positionToInsert];
					positionToInsert--;
				}
				array[positionToInsert+1]=valueToInsert;
			}
			return array;
		}
	}

}
