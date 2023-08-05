package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	static Scanner myObj = new Scanner(System.in);
	static ArrayList<Bank_Account> Bank = new ArrayList<Bank_Account>();
	
	public static void main(String[] args) {
		String a;int op=0;
		
		
		// This is how you add to a List (in this case a List of Student objects and more precisely an ArrayList of Students).
		Bank_Account A1=new Bank_Account(1,9999);
		Bank_Account A2=new Bank_Account(2,29999);
		Bank_Account A3=new Bank_Account(3,19999);
		Bank.add(A1);
		Bank.add(A2);
		Bank.add(A3);
		System.out.println("All Bank Account Details:");
		for(Bank_Account B:Bank) {
			System.out.println(B.Account_number+" "+B.Balance);
		}
		System.out.println();
		
		do{
			System.out.println("\nEnter the choice of operation\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Add new account");
			op = myObj.nextInt();
			switch(op)
			{case 1:
				Deposit();
				break;
			case 2:
				Withdraw();
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				AddNewAccount();
				break;
			default:
				System.out.println("\nInvalid Choice");
				break;
				}
			System.out.println("\nDo you want to continue(y/n)\n");
		a=myObj.next();
		}while(a.equals("y"));
//		System.out.println(A1.Account_number);
//		A1.checkBalance();
//		checkBalance();
//		AddNewAccount();
//		Deposit();
//		Withdraw();
		
	}

	static void AddNewAccount() {
        System.out.println("Enter new Account number");
        int TempAccount = myObj.nextInt();
        System.out.println("Enter a new Account Balance");
        int TempBalance = myObj.nextInt();
        boolean Temp=true;
		for(Bank_Account B:Bank) {
			if(B.Account_number==TempAccount) {
				System.out.println(B.Account_number+" Account number already exists");
				Temp=false;
			}
		}
		
		if(Temp){
			Bank_Account foo = new Bank_Account(TempAccount,TempBalance);
			Bank.add(foo);
			System.out.println("New Account Details Saved");
		}
		for(Bank_Account AB:Bank) {
			System.out.println(AB.Account_number+" "+AB.Balance);
		}
	}
	
	static void checkBalance() {
		 System.out.println("Enter Account number to check balance:");
	        int TempAccount = myObj.nextInt();
	        boolean Temp=true;
	        for(Bank_Account B:Bank) {
	        	
	        	if(B.Account_number==TempAccount) {
	        		System.out.println(B.Account_number+" : "+B.Balance);
	        		Temp=false;
	        		}
	        	
	        	}
			if(Temp){System.out.println("Invalid Account Number");}
    }
	
	static void Deposit() {
		System.out.println("Enter Account number to Deposit money:");
        int TempAccount = myObj.nextInt();
        System.out.println("Enter a Amount to deposit");
        int TempBalance = myObj.nextInt();
        boolean Temp=true;
        for(Bank_Account B:Bank) {
        	
        	if(B.Account_number==TempAccount) {
        		System.out.println("Account Number: "+B.Account_number+" Previous Balance: "+B.Balance);
        		B.Balance=B.Balance+TempBalance;
        		System.out.println("Account Number: "+B.Account_number+" /nNew Balance: "+B.Balance);
        		Temp=false;
        		}
        	
        	}			
        if(Temp){System.out.println("Invalid Account Number");}
	}
	
	static void Withdraw() {
		System.out.println("Enter Account number to withdraw money:");
        int TempAccount = myObj.nextInt();
        System.out.println("Enter a Amount to withdraw");
        int TempBalance = myObj.nextInt();
        boolean Temp=true;
        for(Bank_Account B:Bank) {
        	
        	if(B.Account_number==TempAccount) {
        		if(B.Balance>TempBalance) {
            		System.out.println("Account Number: "+B.Account_number+" Previous Balance: "+B.Balance);
            		B.Balance=B.Balance-TempBalance;
            		System.out.println("Account Number: "+B.Account_number+" /nNew Balance: "+B.Balance);
        		}
        		else {
        			System.out.println("Account Number: "+B.Account_number+" dont't have enough balance to withdraw \nAvailable Balance: "+B.Balance);
        		}
        		Temp=false;}
        	
        	}
		if(Temp){System.out.println("Invalid Account Number");}
	}
}
class Bank_Account{
	Scanner myObj = new Scanner(System.in);
	int Account_number;
	int Balance;

	public Bank_Account(int Account_number, int Balance) {
		this.Account_number=Account_number;
		this.Balance=Balance;
	}
}
