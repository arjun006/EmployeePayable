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
public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Employee(String first, String last, String socialsecuritynum) {
		firstName = first;
		lastName = last;
		ssn = socialsecuritynum;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSSN() {
		return ssn;
	}
	@Override
	public String toString() {
		String first = String.format("%s", getFirstName());
		String last = String.format("%s", getLastName());
		String social = String.format("%s", getSSN());
		
		return "First Name: " + first + "\n" + "Last Name: " + last +
				"\n" + "SSN: " + social + "\n";
	}
}
