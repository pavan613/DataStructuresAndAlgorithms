package com.mobious.dsa;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(""+isPrime(199));
		//printFabonacci(50);
		insertionSort(new int[]{10,5,3,13,52,5,42,4});
	}
	
	
	private static boolean isPrime(int n) {
		if(n==2){
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	
	private static void printFabonacci(int n){
		int mem[]= new int[n];
		mem[0]=0;
		mem[1]=1;
		 System.out.println(mem[0]);
		 System.out.println(mem[1]);
		for(int i=2;i<n;i++){
		  mem[i]=mem[i-1]+mem[i-2]; 
		  System.out.println(mem[i]);
		  
		}
		
		
		
		
	}
	
	
private static void insertionSort(int[] array){
		
		if(array.length==1){
			System.out.println(array[0]);
			return;
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

				for(int i=0;i<array.length;i++){
					System.out.println(array[i]);

				}

		}


	}
	

}
