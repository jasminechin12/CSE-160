// Jasmine Chin 111717723

import java.util.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	
	public Account(int specifiedId, double initialbalance) {
		id = specifiedId;
		balance = initialbalance;
	}
	
	public int getId() {
		return id;
	}
	
	public int setId(int newId) {
		return id = newId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double setBalance(double newBalance) {
		return balance = newBalance;
	}
	
	public double getInterest() {
		return annualInterestRate;
	}
	
	public double setInterest(double newInterest) {
		return annualInterestRate = newInterest;
	}
	
	public Date getDate() {
		Calendar cal = Calendar.getInstance();
		dateCreated = cal.getTime();
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}
	
	public double withDraw(double money) {
		return balance = balance - money;
	}
	
	public double deposit(double money) {
		return balance += money;
	}
	
	public String toString() {
		return "Account Id: " + id + " | " + "Balance: $" + balance + " | " + "Annual Interest Rate: " + annualInterestRate + "%";
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account(1122, 20000);
		acc1.setInterest(4.5);
		System.out.println(acc1);
		acc1.withDraw(2500);
		System.out.println("The balance after withdrawing $2500 is $" + acc1.getBalance());
		acc1.deposit(3000);
		System.out.println("The balance after depositing $3000 is $" + acc1.getBalance());
		System.out.println("Monthly interest for account ID " + acc1.getId() + " is " + acc1.getMonthlyInterestRate());
		System.out.println("Account Id " + acc1.getId() + " was created " + acc1.getDate());
		
		System.out.println();
		
		CheckingsAccount acc2 = new CheckingsAccount(1234, 5000, 2000);
		System.out.println(acc2);
		System.out.println("Account Id " + acc2.getId() + " was created " + acc2.getDate());
		System.out.println("Your new balance is: $" + acc2.withDraw(8000) + '\n' + "You owe money!");
		System.out.println("Your new balance is: $" + acc2.withDraw(2500));
	
		System.out.println();
	
		SavingsAccount acc3 = new SavingsAccount(5678, 10000);
		System.out.println(acc3);
		System.out.println("Account Id " + acc3.getId() + " was created " + acc3.getDate());
		System.out.println("Your new balance is: $" + acc3.withDraw(20000) + '\n' + "You can't take out more money than you have!");
	}

}
