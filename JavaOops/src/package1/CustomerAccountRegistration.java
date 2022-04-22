//Solution No 19
package package1;
//import java.util.Scanner;
class Customer{
	private int custId;
	private String custName;
	private String custAddress;
	private String accType;
	private double custBalance;
	
	public Customer() {
		System.out.println("Print enter valid!");
	}
	
	public Customer(int custId,String custName,String custAddress,String accType,double custBalance) {
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		this.accType=accType;
		this.custBalance=custBalance;
	}
	
	public Customer(int custId,String custName,String custAddress) {
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	
	public Customer(int custId,String custName) {
		this.custId=custId;
		this.custName=custName;
	}
	
	public void setId(int custId) {
		this.custId=custId;
	}
	
	public void setName(String custName) {
		this.custName=custName;
	}
	
	public void setAddress(String custAddress) {
		this.custAddress=custAddress;
	}
	
	public void setAccountType(String accType) {
		this.accType=accType;
	}
	
	public void setBalance(double custBalance) {
		this.custBalance=custBalance;
	}
	
	public int getId() {
		return custId;
	}
	
	public String getName() {
		return custName;
	}
	
	public String getAddress() {
		return custAddress;
	}
	
	public String getAccountType() {
		return accType;
	}
	
	public double getBalance() {
		return custBalance;
	}
	
}
public class CustomerAccountRegistration {
	public static void main(String[] args) {
		Customer Registration1 = new Customer(50001,"Rajiv","Bangalore");
		Customer Registration2 = new Customer(50002,"Shanti","Bangalore","Savings Account",15000);
		Customer Registration3 = new Customer(50003,"Gayatri");
		System.out.println("Customer's Id: " +Registration1.getId());
		System.out.println("Customer's Name: " +Registration1.getName());
		System.out.println("Customer's Address: " +Registration1.getAddress());
		System.out.println("Customer's Account Type: " +Registration1.getAccountType());
		System.out.println("Customer's Balance: " +Registration1.getBalance());
		System.out.println("Customer's Id: " +Registration2.getId());
		System.out.println("Customer's Name: " +Registration2.getName());
		System.out.println("Customer's Address: " +Registration2.getAddress());
		System.out.println("Customer's AccountType: " +Registration2.getAccountType());
		System.out.println("Customer's Balance: " +Registration2.getBalance());
		System.out.println("Customer's Id: " +Registration3.getId());
		System.out.println("Customer's Name: " +Registration3.getName());
		System.out.println("Customer's Address: " +Registration3.getAddress());
		System.out.println("Customer's Account Type: " +Registration3.getAccountType());
		System.out.println("Customer's Balance: " +Registration3.getBalance());
	}
}
