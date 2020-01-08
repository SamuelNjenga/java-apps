package javaApps;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		
		
		int n;
		int array[];
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want in your array");
		n = input.nextInt();
		array = new int[n];
		
		System.out.println("Enter the numbers in your array");
		for(int i = 0;i<n;i++) {
			array[i] = input.nextInt();
		}
		
		
		System.out.println("The sum via iterative is " +iterativeFunc(array));
		System.out.println("The sum via recursive is " +recursiveFunc(array, n -1));

	}
	static int iterativeFunc(int array[]) {
		int sum = 0;
		
		for(int i = 0;i<array.length;i++) {
			sum +=array[i];
		}
		return sum;
	}
	static int recursiveFunc(int array[],int i) {
		if(i==0) 
			return array[i];
		return recursiveFunc(array, i - 1) + array[i];
	}
	

}
