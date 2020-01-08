package javaApps;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) throws Exception {

		int n;

		InputStreamReader isInputStreamReader = new InputStreamReader(System.in);
		BufferedReader bReader= new BufferedReader(isInputStreamReader);

		System.out.println("Enter the  number of elements you want in your vector");
		n = Integer.parseInt(bReader.readLine());
		
		Vector vector = new Vector();
		System.out.println("Your Input:");
		System.out.println("Enter the elements for set 1");
		
		for(int i = 0;i<n;i++) {
			vector.add(Integer.parseInt(bReader.readLine()));
		}
		System.out.println("Enter the elements for set 2");
		for(int i = 0;i<n;i++) {
			vector.add(Integer.parseInt(bReader.readLine()));
		}
		
		System.out.println("The Output:");
		System.out.println(vector);
	}

}
