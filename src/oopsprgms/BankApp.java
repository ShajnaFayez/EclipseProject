package oopsprgms;

import java.util.Scanner;

interface Bank
{
	public void accountdetails();
	public void balance();
	public void withdrawl();
	public void deposit();
	
}

class Federal implements Bank
{
	static String bankname="Federal Bank";
	int accno;
	int balance=50000;
	String accname;
	Scanner sc= new Scanner(System.in);
	@Override
	public void accountdetails() {
		System.out.println("Enter Account no :");
		accno=sc.nextInt();
		System.out.println("Bank Name:"+bankname);
		 System.out.println("Name of account holder: " + accname);  
	        System.out.println("Account no.: " + accno);   
	        System.out.println("Balance: " + balance);  
		
	}
	@Override
	public void balance() {
		System.out.println(balance);
		
	}
	@Override
	public void withdrawl() {
		System.out.println("Enter the amount to Withdraw");
		Scanner sc1=new Scanner(System.in);
		int wa=sc1.nextInt();
		
		 if (balance >= wa) 
	        {  
	            balance = balance - wa;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        }
		 else 
	        {  
	            System.out.println("Amount cannot be Withdrawed" );  
	        }  
	 
		
	}
	@Override
	public void deposit() {
		System.out.println("Enter Deposit");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("Balance= "+balance);
		
	}
}
public class BankApp {

	public static void main(String[] args) {
		
		Federal ob=new Federal();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Enter your Choice  1. Account Details 2.Balance 3.Deposit 4.Withdrawl");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				ob.accountdetails();
				break;
			case 2:
				ob.balance();
				break;
			case 3:
				ob.deposit();
				break;
			case 4:
				ob.withdrawl();
				break;
			default:
				System.out.println("Invalid Choice ");
				break;
				
			}
		}
			while(ch>0 && ch<=3);
		
		
		
		
	}

}
