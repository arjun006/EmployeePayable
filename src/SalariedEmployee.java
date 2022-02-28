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
public class SalariedEmployee extends Employee {
	private double weeklySalary;
	public SalariedEmployee(String first, String last, String ssn, double weekly) {
		super(first,last,ssn);
		setSalary(weekly);
	}
	public void setSalary(double salary) {
		if(salary >= 0.0) {
			weeklySalary = salary;
		} else {
			throw new IllegalArgumentException("Salary must be >= 0.0");
		}
	}
	public double getSalary() {
		return weeklySalary;
	}
	public double getPaymentAmount() {
		return getSalary();
	}
	@Override
	public String toString() {
		String salary = String.format("%.2f",getSalary());
		return super.toString() + "Salary: " + salary + "\n";
	}
}
