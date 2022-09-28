package BankingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ICICIclass {
	Bank1 b=new Bank1();
	int withdrawn=0;
	int dep=0;
	int prev_transaction;
	String tran_Status;
	
	int deposite(int money) {
		dep=b.getsalary()+money;
		return dep;
	}
	
	int withDrawl(int money) {
		withdrawn=dep - money;
		try {
			if(withdrawn<0) {
				System.out.println("Deposite can not be negative");
				tran_Status="TRANSACTION FAIL";
				return withdrawn;
			}else {
				tran_Status="TRANSACTIN PASS!";
				return withdrawn;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TRANSACTION FAILURE!!");
		}
		return=0;
	}
	void log() {
		System.out.print("Time of Transaction:");
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println("User Account Number:"+b.getaccountNo());
		
		System.out.println("Amount Withdrawn:"+withdrawn);
		System.out.println("Amount before Withdrawn:"+dep);
		System.out.println("Amount After Withdrawn:"+withdrawn);
		System.out.println("Amount After Withdrawn:"+ tran_Status);
		
	}
	void exit() {
		System.exit(0);
	}



}
