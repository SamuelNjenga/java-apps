package javaApps;
import java.util.List;
import java.util.Scanner;

public class EvenOrOddDemo {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements you want in your array");
		n = input.nextInt();
		int array[] = new int[n];
		System.out.println("Enter all the elements:");

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("You have entered the following numbers");

		for (int i:array) {
			System.out.println(i);
		}

		System.out.println("The following numbers are even");

		for (int i:array) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

		System.out.println("The following numbers are odd");
		for (int i:array) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

}
