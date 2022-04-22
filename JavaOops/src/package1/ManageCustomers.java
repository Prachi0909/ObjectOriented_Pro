//Solution No 26
package package1;
import java.util.*;
import java.util.Scanner;
class Customers{
	private double accNumber;
	private String holderName;
	private String accType;
	private String dofBirth;
	private double accBalance;
	private String address;
	static Customers customerObjArray[] = new Customers[6];
	static Customers temp=null;
    static int index=0;
	//static double userId[] = new double[30];
	//static String userName[] = new String[30];
	//static String userNonZeroBalance[] = new String[30];
	//static String sortedUserAddress[] = new String[30];
	//static String sortedUserId[] = new String[30];
	
	public Customers() {
		System.out.println("Default");
	}
	public Customers(double accNumber,String holderName,String accType,String dofBirth,double accBalance,String address) {
		this.accNumber=accNumber;
		this.holderName=holderName;
		this.accType=accType;
		this.dofBirth=dofBirth;
		this.accBalance=accBalance;
		this.address=address;
		customerObjArray[index]=this;
		index++;
	}
	public double getaccNumber() {
		return accNumber;
	}
	public String getholderName() {
		return holderName;
	}
	public String getaccType() {
		return accType;
	}
	public String getdofBirth() {
		return dofBirth;
	}
	public double getaccBalance() {
		return accBalance;
	}
	public String getaddress() {
		return address;
	}
	public void bankUser() {
		System.out.println("Enter the Account Number: " +getaccNumber());
		System.out.println("Name of the Account Holder: " +getholderName());
		System.out.println("Name of the Account Type: " +getaccType());
		System.out.println("Enter your Date of Birth: " +getdofBirth());
		System.out.println("Enter your Account Balance: " +getaccBalance());
		System.out.println("Enter your Address Name: " +getaddress());
	}
	public void setholderName(String updateName) {
		holderName=updateName;
		System.out.println("Your updated name is: " +updateName);
	}
	public void setaddress(String addressUpdate) {
		address=addressUpdate;
		System.out.println("Your updated address is: " +addressUpdate);
	}
	
	public void deleteUser() {
		double a=accNumber=00;
		String b=holderName=null;
		String c=accType=null;
		String d=dofBirth=null;
		double e=accBalance=000;
	    String f=address=null;
	}
	
	public static  void getUserDetailbyId(double ID ) {
		for(int i=0;i<customerObjArray.length;i++) {
			if(customerObjArray[i].accNumber == ID) {
				System.out.println("Your account details are: ");
				System.out.println("Account number: " + customerObjArray[i].accNumber);
				System.out.println("Holder Name: " + customerObjArray[i].holderName);
				System.out.println("Account Type: " + customerObjArray[i].accType);
				System.out.println("Date of Birth: " + customerObjArray[i].dofBirth);
				System.out.println("Account Balance: " + customerObjArray[i].accBalance);
				System.out.println("Address: " +customerObjArray[i].address);
				return ;       
			}
		}
	    System.out.println("Invalid Id");
	}
	
    public static void getUserDetailsName(String name) {
    	for(int i=0;i<customerObjArray.length;i++) {
			if((customerObjArray[i]).equals(name)) {
				System.out.println("Your account details are: ");
				System.out.println("Account number: " + customerObjArray[i].accNumber);
				System.out.println("Holder Name: " + customerObjArray[i].holderName);
				System.out.println("Account Type: " + customerObjArray[i].accType);
				System.out.println("Date of Birth: " + customerObjArray[i].dofBirth);
				System.out.println("Account Balance: " + customerObjArray[i].accBalance);
				System.out.println("Address: " +customerObjArray[i].address);
				return ;       
			}
		}
	    System.out.println("Invalid Name");
    }
    
    public static void getUserDetainHavingNonZeroBalance(  ) {
        	for(int i=0;i<customerObjArray.length;i++) {
        		if((customerObjArray[i]) == null ) {
        		       System.out.println("Account with 0 balance!");
        		}
        		else if((customerObjArray[i].accBalance) != 0 ) {
        			System.out.println("The users who have non-zero balance: ");
        			System.out.println("Account number: " + customerObjArray[i].accNumber);
    				System.out.println("Holder Name: " + customerObjArray[i].holderName);
    				System.out.println("Account Type: " + customerObjArray[i].accType);
    				//System.out.println("Date of Birth: " + customerObjArray[i].dofBirth);
    				System.out.println("Account Balance: " + customerObjArray[i].accBalance);
    				//System.out.println("Address: " +customerObjArray[i].address);
        		}
        	}
    }
    
    public static void sortedBasedAddress () {
    	int sizeofStringArray=customerObjArray.length;
    	for(int i=0;i<sizeofStringArray;i++) {
			for(int j=i+1;j<sizeofStringArray;j++) {
				String str1 = customerObjArray[i].address;
				String str2 = customerObjArray[i].address;
				
				if(str1.compareTo(str2) > 0) {
					temp=customerObjArray[i];
					customerObjArray[i]=customerObjArray[j];
					customerObjArray[j]=temp;
				}
			}
			System.out.println("Your account details are: ");
			System.out.println("Account number: " + customerObjArray[i].accNumber);
			System.out.println("Holder Name: " + customerObjArray[i].holderName);
			System.out.println("Account Type: " + customerObjArray[i].accType);
			System.out.println("Date of Birth: " + customerObjArray[i].dofBirth);
			System.out.println("Account Balance: " + customerObjArray[i].accBalance);
			System.out.println("Address: " +customerObjArray[i].address);
		}
    }
    
    public static void sortedBasedAccountId() {
    	int sizeofIntArray=customerObjArray.length;
		for(int i=0;i<sizeofIntArray;i++) {
			for(int j=i;j<sizeofIntArray;j++) {
				if(Customers.customerObjArray[i].accNumber > Customers. customerObjArray[j].accNumber ) {
					temp=customerObjArray[i];
					customerObjArray[i]=customerObjArray[j];
					customerObjArray[j]=temp;
				}
			}
			System.out.println("Your account details are: ");
			System.out.println("Account number: " + customerObjArray[i].accNumber);
			System.out.println("Holder Name: " + customerObjArray[i].holderName);
			System.out.println("Account Type: " + customerObjArray[i].accType);
			System.out.println("Date of Birth: " + customerObjArray[i].dofBirth);
			System.out.println("Account Balance: " + customerObjArray[i].accBalance);
			System.out.println("Address: " +customerObjArray[i].address);
		}
     }
    
}
public class ManageCustomers {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Customers Customer1 = new Customers(326937859,"Prachi","Salary Account","09-09-2001",20000,"Mumbai");
	Customers Customer2 = new Customers(326935208,"Disha","Savings Account","17-09-2007",2000,"UP");
	Customers Customer3 = new Customers(326925475,"Atharva","current Account","15-03-20015",000,"Prayagraj");
	Customers Customer4 = new Customers(326468785,"Prathmesh","Salary Account","09-09-2001",1500,"Kanpur");
	Customers Customer5 = new Customers(324547208,"Kartik","Savings Account","17-09-2007",2400,"Amritsar");
	Customers Customer6 = new Customers(326956475,"Aastik","current Account","15-03-20015",000,"Chandigarhs");
	System.out.println("Here is your Menu: \n" + " Enter your choice: " );
	int choice=sc.nextInt();
	switch(choice) {
	case 1: { 
		System.out.println("Your Details are: \n");
		System.out.println("Customer 1 details: \n");
		Customer1.bankUser();
		System.out.println("\n");
		System.out.println("Customer 2 details: \n");
		Customer2.bankUser();
		System.out.println("\n");
		System.out.println("Customer 3 details: \n");
		Customer3.bankUser();
		System.out.println("\n");
		System.out.println("Customer 4 details: \n");
		Customer4.bankUser();
		System.out.println("\n");
		System.out.println("Customer 5 details: \n");
		Customer5.bankUser();
		System.out.println("\n");
		System.out.println("Customer 6 details: \n");
		Customer6.bankUser();
		break;
	}
	case 2: {
		System.out.println("You can Update your Details: \n");
		System.out.println("You can update your name: ");
		String nameUpdate = sc.nextLine();
		Customer1.setholderName(nameUpdate);
		System.out.println("You can update your address: \n");
		String addressUpdate = sc.nextLine();
		Customer1.setaddress(addressUpdate);
		Customer1.bankUser();
		break;
	}
	case 3: {
		System.out.println("Your details will be removed from the record: ");
		Customer2.deleteUser();
		Customer1.bankUser();
		Customer2.bankUser();
	    break;
	}
	case 4: {
		Customers.getUserDetailbyId(326937859);
		System.out.println("Your Details are: \n");
		Customers.getUserDetailsName("Prachi");
		System.out.println("Your Details are: \n");
		Customers.getUserDetainHavingNonZeroBalance();
		System.out.println("Your Details are: \n");
		Customers.sortedBasedAddress();
		System.out.println("Your Details are: \n");
		Customers.sortedBasedAccountId();
		break;
	}
	default : 
		System.out.println("Invalid");
	
	}
	sc.close();
	}
}
