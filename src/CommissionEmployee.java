/**********************************************
Workshop #3
Course:<JAC444> - Semester
Last Name: Devakumar
First Name:Arjun
ID:159076199
Section:NFF
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:Feb 14, 2021
**********************************************/
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last, String ssn, double gross, double commRate) {
		super(first, last, ssn);
		setGrossSales(gross);
		setCommissionRate(commRate);
	}
	
	public double getPaymentAmount() {
		return getGrossSales() * getCommissionRate();
	}
	
	public void setCommissionRate(double rate) {
		commissionRate = rate;
	}
	public double getCommissionRate(){
		return commissionRate;
	}
	public void setGrossSales(double sales) {
		if(sales >= 0.0) {
			grossSales = sales;
		} else {
			throw new IllegalArgumentException("Sales must be >= 0.0");
		}
	}
	public double getGrossSales() {
		return grossSales;
	}
	
	@Override
	public String toString() {
		String sales = String.format("%.2f",getGrossSales());
		String comm = String.format("%.2f", getCommissionRate());
		return super.toString() + "Sales: " + sales + "\n" + "Commission: " + comm + "\n";
	}
}
