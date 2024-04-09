package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: Feb 27
 * 
 * Explanation: Creates and manages an ATM
 * 
*/
public class PolymorphismRWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("\nCreate a new Account");
		System.out.print("\nInput the following information");
		System.out.print("\nAccount id: ");
		int tempId = input.nextInt();
		input.nextLine();
		System.out.print("\nCurrent Balance: $");
		double tempBal = input.nextDouble();
		System.out.print("\nAnnual interst rate (in percent increase per year): ");
		double tempIntrest = input.nextDouble();
		Account account = new Account(tempId,tempBal,tempIntrest);
		SavingsAccount saveingsAccount = new SavingsAccount(tempId,tempBal,tempIntrest);
		System.out.print("\nOverdraft Limit for Checking account: ");
		double tempOver = input.nextDouble();
		CheckingAccount checkingAccount = new CheckingAccount(tempId,tempBal,tempIntrest, tempOver);
		
		System.out.print("\n\n"+account);
		System.out.print(saveingsAccount);
		System.out.print(checkingAccount);
	}

}
class Account{
	int id;
	double balance;
	double annualIntrestRate;
	Date dateCreated;
	
	Account(){
		id = 0;
		balance = 100;
		annualIntrestRate = 5;
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
	public int getId() {
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
		if(balance-ammount>=0) {
		balance = balance - ammount;
		}
	}
	public void deposit(double ammount) {
		balance = balance + ammount;
	}
	public String toString() {
		return "Type of Account: Basic"+"\nAccount id: "+getId()+"\n Balance: $"+getBalance()+"0\n Annual Intrest Rate: "+getAnnualIntrestRate()+"%\n Date Created: "+dateCreated();
	}
}
class CheckingAccount extends Account{
	double overdraftLimit;
	CheckingAccount(){
		overdraftLimit=100;
	}
	CheckingAccount(int id){
		super(id);
		overdraftLimit=100;
	}
	CheckingAccount(int id,double OverDraft){
		super(id);
		overdraftLimit = OverDraft;
	}
	CheckingAccount (int newId, double newBal, double newIntrestRate){
		super(newId,newBal, newIntrestRate);
		overdraftLimit=100;
	}
	CheckingAccount (int newId, double newBal, double newIntrestRate, double OverDraft){
		super(newId, newBal, newIntrestRate);
		overdraftLimit = OverDraft;
	}
	public double getOverdraftLimit(){
		return overdraftLimit;
	}
	public void withdrawl(double ammount) {
		if(balance-ammount>=0-overdraftLimit) {
		balance = balance - ammount;
		}
	}
	public String toString() {
		return "\n\nType of Account: Checking"+"\nAccount id: "+super.getId()+"\n Balance: $"+super.getBalance()+"0\n Annual Intrest Rate: "+super.getAnnualIntrestRate()+"%\n Date Created: "+super.dateCreated()+"\n Overdraft Limit: $"+overdraftLimit+"\n";
	}
}
class SavingsAccount extends Account{
	SavingsAccount(){
		
	}
	SavingsAccount(int id){
		super(id);
	}

	SavingsAccount (int newId, double newBal, double newIntrestRate){
		super(newId,newBal, newIntrestRate);
	}
	public String toString() {
		return "\n\nType of Account: Savings"+"\nAccount id: "+super.getId()+"\n Balance: $"+super.getBalance()+"0\n Annual Intrest Rate: "+super.getAnnualIntrestRate()+"%\n Date Created: "+super.dateCreated()+"\n";
	}
}
