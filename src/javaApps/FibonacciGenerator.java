package javaApps;

import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter n ");
		int n= input.nextInt();

		System.out.println("The series of fibonacci numbers up to n by iteration  is ");
		for(int i=1;i<=n;i++) {
			System.out.println(fibonnaciIterative(i));
		}

		System.out.println("The series of fibonacci numbers up to n by recursion  is ");
		for(int i=1;i<=n;i++) {
			System.out.println(fibonacciRecursive(i));
		}

	}

	static int fibonnaciIterative(int n) {
		if(n  == 1 || n == 2) {
			return 1;
		}



		int fibo1 = 1;
		int fibo2 = 1;
		int fibonacci = 1;

		for(int i = 3;i<=n;i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}

	static int fibonacciRecursive(int n) {
		if(n == 1||n==2) {
			return 1;

		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);

	}
}
