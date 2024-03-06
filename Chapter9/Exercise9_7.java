package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Feb 27
 * 
 * Explanation: Creates and manages a financial account
 * 
*/
public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Create a new Account");
		System.out.println("Input the following information");
		System.out.println("Account Id: ");
		double tempId = input.nextDouble();
		System.out.println("Current Balance: $");
		double tempBal = input.nextDouble();
		System.out.println("Annual interst rate (in percent increase per year): ");
		double tempIntrest = input.nextDouble();
		Account userAccount = new Account(tempId, tempBal, tempIntrest);

		while(true) {
			System.out.println("\n\nWhat would you like to do? (input the number before the action)");
			System.out.println("1: Get Id");
			System.out.println("2: Get Balance");
			System.out.println("3: Get Annual Intrest Rate (in percent increase per year)");
			System.out.println("4: Get the date this account was created");
			System.out.println("5: Get Monthly Intrest Rate (in percent increase per month)");
			System.out.println("6: Get Monthly Intrest");
			System.out.println("7: Withdrawl");
			System.out.println("8: Deposit");
			System.out.print(" : ");
			int user = input.nextInt();
			System.out.print("\n\n");
			switch(user) {
			
			case 1:
				System.out.printf("The user account Id is %.0f\n", userAccount.getId());
				break;
			case 2:
				System.out.printf("The user account balance is $%.2f\n", userAccount.getBalance());
				break;
			case 3:
				System.out.printf("The user account Annual Intrest Rate is %.2f%%\n", userAccount.getAnnualIntrestRate());
				break;
			case 4:
				System.out.printf("The user account start date was %s\n", userAccount.dateCreated());
				break;
			case 5:
				System.out.printf("The user account monthly intrest rate is %.2f%%\n", userAccount.getMonthlyIntrestRate());
				break;
			case 6:
				System.out.printf("The user account monthly intrest is $%.2f\n", userAccount.getMonthlyIntrest());
				break;
			case 7:
				System.out.printf("The current balance is $%.2f\n", userAccount.getBalance());
				System.out.print("How much would you like to withdrawl: $");
				double tempDoubleW = input.nextDouble();
				userAccount.withdrawl(tempDoubleW);
				System.out.printf("The new balance is $%.2f\n", userAccount.getBalance());
				break;
			case 8:
				System.out.printf("The current balance is $%.2f\n", userAccount.getBalance());
				System.out.print("How much would you like to deposit: $");
				double tempDoubleD = input.nextDouble();
				userAccount.deposit(tempDoubleD);
				System.out.printf("The new balance is $%.2f\n", userAccount.getBalance());
				break;

			}
		}
	}

}
class Account{
	double id;
	double balance;
	double annualIntrestRate;
	Date dateCreated;
	
	Account(){
		id = 0;
		balance = 0;
		annualIntrestRate = 0;
		dateCreated = new Date();
	}
	Account(double newId, double newBal, double newIntrestRate){
		id = newId;
		balance = newBal;
		annualIntrestRate = newIntrestRate;
		dateCreated = new Date();
	}
	public double getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}
	public Date dateCreated() {
		return dateCreated;
	}
	public double getMonthlyIntrestRate() {
		return ((annualIntrestRate/100)/12)*100;
	}
	public double getMonthlyIntrest() {
		return ((annualIntrestRate/100)/12)*balance;
	}
	public void withdrawl(double ammount) {
		balance = balance - ammount;
	}
	public void deposit(double ammount) {
		balance = balance + ammount;
	}
}
