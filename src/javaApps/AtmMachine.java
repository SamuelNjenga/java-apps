package javaApps;
import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {

		float balance = 0;
		float amountWithdrawn = 0;
		float airtimeBought = 0;
		float amountDeposited = 0;
		int option;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select the transaction which you want:");
		System.out.println("(1)Check account balance");
		System.out.println("(2)Withdraw money");
		System.out.println("(3)Buy airtime");
		System.out.println("(4)Deposit cash");
		option = input.nextInt();
        
		switch (option) {
		case 1:
			System.out.println("Your balance is "+balance);
			break;
		case 2:
			if(balance >=amountWithdrawn&&amountWithdrawn <=20000)
				System.out.println("You have withdrawn "+amountWithdrawn);
			break;
		case 3:
			if(balance >=airtimeBought)
				System.out.println("You have bought an airtime of  "+airtimeBought);
			break;
		case 4:
			System.out.println("You have deposited  "+amountDeposited);
			break;
		default:
			System.out.println("Enter a valid option");
			break;
		}

	}

}
