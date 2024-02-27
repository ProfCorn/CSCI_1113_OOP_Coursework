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
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("1: Get ID");
			System.out.println("2: Get Balance");
			System.out.println("3: Get Annual Intrest Rate");
			System.out.println("4: Get the date this account was created");
			System.out.println("5: Get Monthly Intrest Rate");
			System.out.println("6: Get Monthly Intrest");
			System.out.println("7: Withdrawl");
			System.out.println("8: Deposit");
			System.out.print(" : ");
			int user = input.nextInt();
			
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