package javaApps;

import java.util.Scanner;

public class PrimeSum {

	static boolean checkPrime(int numToCheck) {

		if(numToCheck == 1) {
			return false;
		}

		for(int i = 2; i*i<=numToCheck;i++) {
			if(numToCheck %i==0) {
				return false;
			}

		}
		return true;
	}

	static int primeSum(int n,int m) {
		int sum=0;
		for(int i= m;i>=n;i--) {
			boolean isPrime = checkPrime(i);
			if(isPrime) {
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter m");
		int m  = input.nextInt();
		System.out.println("Enter n");
		int n  = input.nextInt();
		System.out.println(primeSum(m, n));
	}

}
