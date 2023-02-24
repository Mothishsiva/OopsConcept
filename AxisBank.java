package Oops;

public class AxisBank extends BankInfo {
	public void deposite() {
	System.out.println("deposite the amount");
	}
	public static void main(String[] args) {
		BankInfo obj=new AxisBank(); 
		obj.fixed();
		obj.deposite();
		obj.Saving();
	}


}