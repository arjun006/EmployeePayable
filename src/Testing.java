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

public class Testing {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Payable[] p = new Payable[4];
		  Payable[] invoice = new Payable[1];
		  p[0] = new HourlyEmployee("Dwight", "Schrute","111-000-223", 17.50, 37.5);
		  p[1] = new SalariedEmployee("Michael", "Scott", "324-123-884", 1800.94);
		  p[2] = new CommissionEmployee("Jim", "Halpert", "442-142-994", 12043.43, 0.08);
		  p[3] = new BasePlusCommissionEmployee("Stanley", "Hudson", "324-124-445", 1365.88);
		  invoice[0] = new Invoice("253499","Double bonded white paper", 1000, 98.75);
		  
		  System.out.println("Employees are proccessed individually \n");
		  
		  for(int i=0; i < p.length; i++) {
			  System.out.println("Employee " + (i+1) + ": ");
			  System.out.print(p[i].toString());
			  System.out.println("Payment: "+String.format("%.2f",p[i].getPaymentAmount()) + "\n");
		  }
		  System.out.println("Invoice:");
		  System.out.print(invoice[0].toString());
		  System.out.println("Payment: "+String.format("%.2f",invoice[0].getPaymentAmount()) + "\n");
	}

}


