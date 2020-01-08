package javaApps;

import java.util.Scanner;

public class XpowerY {

	public static void main(String[] args) {
	
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the value of X");
   int x = input.nextInt();
   System.out.println("Enter the value of n");
   int n = input.nextInt();
   System.out.println("X^n by iteration is "+f_iterative(x, n));
   System.out.println("X^n by recursion is "+f_recursive(x, n));
   

	}
	static int f_iterative(int  x, int n) {
		int pow = 1;
		for(int i = 0;i<n;i++) {
			pow *= x;
		}
		return pow;
	}
	static int f_recursive(int x,int n) {
		if(n==0)
			return 1;
		else if(n==1)
			return x;
		else if(n%2==0)
			return f_recursive(x, n/2) * f_recursive(x, n/2);
		else {
			return  x * f_recursive(x, n/2) * f_recursive(x, n/2);
		}
	}

}
