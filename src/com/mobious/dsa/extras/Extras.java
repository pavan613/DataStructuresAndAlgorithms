package com.mobious.dsa.extras;

public class Extras {

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
	
}
