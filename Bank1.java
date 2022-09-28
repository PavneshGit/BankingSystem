package BankingSystem;

public class Bank1 {
	private Double rateofintrest=1.2;
	private String pName="Pavnesh singh";
	private int accountNo=50012467;
	private int salary=32500;
	
	public Bank1() { }
		public Bank1(double rateofintrest,String pName,int accountNo, int salary) {
			this.rateofintrest=rateofintrest;
			this.pName=pName;
			this.accountNo=accountNo;
			this.salary=salary;			
		}
		
		public double getRateOfintrest() {
			return rateofintrest;
		}
		
		public void setrateOfintrest(double rateofintrest) {
			this.rateofintrest=rateofintrest;
		}
		
		public String getName() {
			return pName;
		}
		public void   setName(String pName) {
			this.pName=pName;
		}
		public int getaccountNo() {
			return accountNo;
		}
		public void setAccountNo(Integer accountNo) {
			this.accountNo=accountNo;
		}
		
		public int getsalary() {
			return salary;
		}
		
		public void setsalary(int salary) {
			this.salary=salary;
		}
	

}
