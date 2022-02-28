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
public class BasePlusCommissionEmployee extends Employee{
	private double baseSalary;
	public BasePlusCommissionEmployee(String first, String last, String ssn, double base) {
		super(first,last,ssn);
		setBaseSalary(base);
	}
	public void setBaseSalary(double base) {
		if(base >= 0.0) {
			baseSalary = base;
		} else {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public double getPaymentAmount() {
		return getBaseSalary() * 1.1;
	}
	@Override
	public String toString() {
		String salary = String.format("%.2f",getPaymentAmount());
		return super.toString() + "Base + Commission: " + salary + "\n";
	}
}
