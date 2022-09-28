package BankingSystem;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIclass s=new SBIclass();
		BOIclass b=new BOIclass();
		ICICIclass i=new ICICIclass();
		Bank1 bank=new Bank1();
		Scanner scan=new Scanner(System.in);
		int option='\0';
		int option2='\0';
		int option3='\0';
		int  Salary;
		String nme;
		int account;
		int money;
		char c;;
		System.out.println("*******Welcome To Bank**********");
		System.out.println("Name:"+bank.getName());
		System.out.println("Account Number:"+bank.getaccountNo());
		System.out.println("salary:"+bank.getsalary());
		
		System.out.println("Type Of Bank:");
		System.out.println("1. SBI");
		System.out.println("2. BOI");
		System.out.println("3. ICICI");
		System.out.println("Select Your Bank in Above Options:");
		
		
		do {
			option=scan.nextInt();
			switch(option) {
			 
			case 1:
				System.out.println("**Welcome To SBI Bank**");				
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. check For log");
				System.out.println("Q. Exit");
				System.out.println("What do You Like to do?");
			
			do {
				c=scan.next().charAt(0);
				switch(c) {
				case 'D':
					System.out.println("Enter Deposite amount:");
					Salary=scan.nextInt();
					s.deposite(Salary);
					System.out.println("Your Deposite amount:"+s.deposite(Salary));		
					break;
					
				case 'W':
					System.out.println("Enter Withdrawn amount:");
					Salary=scan.nextInt();
					s.withDrawl(Salary);
					System.out.println("Your Withdrawn amount:"+s.withDrawl(Salary));		
					break;
					
				case 'L':
					s.log();
				case 'Q':
					System.out.println("Exit");
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}
			}while(c!='Q'); 
			break;
			
			case 2:
				
				System.out.println("Welcome To Bank Of India");				
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. check For log");
				System.out.println("Q. Exit");
				System.out.println("What Would You Like to do?");
			do {
				c=scan.next().charAt(0);
				switch(c) {
				case 'D':
					System.out.println("Enter Deposite amount:");
					Salary=scan.nextInt();
					s.deposite(Salary);
					System.out.println("Your Deposite amount:"+s.deposite(Salary));		
					break;
					
				case 'W':
					System.out.println("Enter Withdrawn amount:");
					Salary=scan.nextInt();
					s.withDrawl(Salary);
					System.out.println("Your Withdrawn amount:"+s.withDrawl(Salary));		
					break;
					
				case 'L':
					s.log();
				case 'Q':
					System.out.println("Exit");
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}
			}while(c!='Q'); 
			break;
				
			
			
			case 3:
				
				System.out.println("Welcome To ICICI Bank");				
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. check For log");
				System.out.println("Q. Exit");
				System.out.println("What Would You Like to do?");
			 
			do {
				c=scan.next().charAt(0);
				switch(c) {
				case 'D':
					System.out.println("Enter Deposite amount:");
					Salary=scan.nextInt();
					s.deposite(Salary);
					System.out.println("Your Deposite amount:"+s.deposite(Salary));		
					break;
					
				case 'W':
					System.out.println("Enter Withdrawn amount:");
					Salary=scan.nextInt();
					s.withDrawl(Salary);
					System.out.println("Your Withdrawn amount:"+s.withDrawl(Salary));		
					break;
					
				case 'L':
					s.log();
				case 'Q':
					System.out.println("Exit");
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}
			}while(c!='Q'); 
			break;
		default:
			System.out.print("Oops! Something went wrong");
			break;
		}break;
		}while(option!=3);

	}
}


