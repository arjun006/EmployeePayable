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
public class Invoice implements Payable {
	
	private String partNum;
	private String description;
	private int count;
	private double itemCost;
	
	public Invoice(String part, String desc, int cnt, double price) {
		partNum = part;
		description = desc;
		setCount(cnt);
		itemCost = price;
	}
	public void setPartNumber(String part) {
		partNum = part;
	}
	public String getPartNumber() {
		return partNum;
	}
	public void setDescription(String desc) {
		description = desc;
	}
	public String getDescription() {
		return description;
	}
	public void setCount(int cnt) {
		if(cnt >= 0) {
			count = cnt;
		} else {
			throw new IllegalArgumentException("Count must be greater than or equal to 0");
		}
	}
	public int getCount() {
		return count;
	}
	public void setPrice(double price) {
		itemCost = price;
	}
	public double getPrice() {
		return itemCost;
	}
	@Override
	public String toString() {
		String quantity = String.format("%d",getCount());
		String description = String.format("%s", getDescription());
		String partNumber = String.format("%s", getPartNumber());
		String cost = String.format("%.2f",getPrice());
		String total = String.format("%.2f",getPaymentAmount());
		return "Part Number: " + partNumber + "\n" + "Description: " + description + 
				"\n" + "Quantity: " + quantity + "\n" + "Item Cost: " + cost + "\n" + "Total: " + total + "\n";
	}
	
	public double getPaymentAmount() {
		double price = getPrice();
		double quantity = getCount();
		double total = price * quantity;
		return total;
	}
	
}
