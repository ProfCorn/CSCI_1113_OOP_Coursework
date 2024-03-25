package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Feb 27
 * 
 * Explanation: Creates and manages an ATM
 * 
*/
public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for(int i =0; i<10; i++) {
			accounts[i] = new Account(i);
		}
		while(true) {
			System.out.println("\n\nEnter an id: ");
			int ca = input.nextInt();
			
			if (ca>=0&&ca<=9) {
				boolean sin = true;
			while (sin) {
				
			
			System.out.println("\ncurrent id ("+ca+")\n");
			System.out.println("Main menu");
			
			System.out.println("1: Get Balance");
			System.out.println("2: Withdrawl");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			System.out.print(" : ");
			int user = input.nextInt();

			System.out.print("\n\n");
			
			switch(user) {
			
			
			case 1:
				System.out.printf("The user account balance is $%.2f\n", accounts[ca].getBalance());
				break;
			
			case 2:
				System.out.printf("The current balance is $%.2f\n", accounts[ca].getBalance());
				System.out.print("How much would you like to withdrawl: $");
				double tempDoubleW = input.nextDouble();
				accounts[ca].withdrawl(tempDoubleW);
				System.out.printf("The new balance is $%.2f\n", accounts[ca].getBalance());
				break;
			case 3:
				System.out.printf("The current balance is $%.2f\n", accounts[ca].getBalance());
				System.out.print("How much would you like to deposit: $");
				double tempDoubleD = input.nextDouble();
				accounts[ca].deposit(tempDoubleD);
				System.out.printf("The new balance is $%.2f\n", accounts[ca].getBalance());
				break;
			case 4:
				System.out.println("\nsigning out\n");
				sin = false;
				break;
			} 
			}
			}
			else {
				System.out.println("That is not a valid account id\n");
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
	Account(int newId){
		id = newId;
		balance = 100;
		annualIntrestRate = 5;
		dateCreated = new Date();
	}
	Account(int newId, double newBal, double newIntrestRate){
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
