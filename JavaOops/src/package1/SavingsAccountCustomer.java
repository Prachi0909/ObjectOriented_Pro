//Solution No 20
package package1;
import java.util.Scanner;
class SavingsAccount {
	double balance=20000;
	int interestRate=9;
    int accountNo;
    int time=2;      //2 year
    double amount;
    double remainingAmount;
    
    public SavingsAccount() {
    	System.out.println("");
    }
    
    public SavingsAccount(double balance,int interestRate,int accountNo) {
    	this.balance=balance;
    	this.interestRate=interestRate;
    	this.accountNo=accountNo;
    }
    
    public void withDraw(double amount) {
    	this.amount=amount;
    	if(amount>balance) {
    		System.out.println("Error !!!!!!!!");
    	}
    	else {
    		remainingAmount=(balance-amount);
    		System.out.println("Succussfully withdrawn " + amount);
    		System.out.println("Remaining amount is " + remainingAmount );
    	}
    	amount=remainingAmount;
    }
    
    public void calculateInterest() {
    	double simpleInterest;
    	simpleInterest=(remainingAmount * interestRate * time) / 100;
    	System.out.println("The Simple Interest for the balance maintained in the savings account is: " +simpleInterest);
    }
}
public class SavingsAccountCustomer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int accountNo=sc.nextInt();
		System.out.println("Enter the amount you want to withdrawn: ");
		double amount=sc.nextDouble();
		SavingsAccount FunctionCalling=new SavingsAccount();
		FunctionCalling.withDraw(amount);
		FunctionCalling.calculateInterest();
		sc.close();
	}
}
