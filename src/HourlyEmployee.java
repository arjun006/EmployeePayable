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
public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String first, String last, String ssn, double wage, double hours) {
		super(first,last,ssn);
		setWage(wage);
		setHours(hours);
	}
	public void setWage(double wages) {
		if(wages >= 0.0) {
			wage = wages;
		} else {
			throw new IllegalArgumentException("Wage must be >= 0.0");
		}
	}
	public double getWage() {
		return wage;
	}
	public void setHours(double hrs) {
		if(hrs >= 0.0 && hrs <= 168.0) {
			hours = hrs;
		} else {
			throw new IllegalArgumentException("Hours must be >= 0.0 & <= 168.0");
		}
	}
	public double getHours() {
		return hours;
	}
	public double getPaymentAmount() {
		return getWage() * getHours();
	}
	@Override
	public String toString() {
		String wages = String.format("%.2f",getWage());
		String hrs = String.format("%.2f", getHours());
		return super.toString() + "Wages: " + wages + "\n" + "Hours: " + hrs + "\n";
	}
	

}
