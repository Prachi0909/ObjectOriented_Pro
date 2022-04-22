//Solution No 16
package package1;
import java.util.Scanner;
class Store{
	int itemId;
	int itemPrice;
	int itemQuantity;
	int[] arrayid=new int [] {5001,5002,5003,5004,5005};
	int[] arrayprice=new int[] {1000,2000,3000,4000,5000};
	
	public int getPriceUsingIdx() {
		int idx=-1;
		for(int i=0;i<arrayid.length;i++) {
			if(arrayid[i] == itemId) {
				idx=i;
				break;
			}
		}
		if(idx==-1) {
			return -1;       //return when item is not available in array.
		} else {
			return arrayprice[idx];    //returning the price of the item. 
		}
	}
	
	public int getBill() {
		int billId;
		billId=(itemPrice*itemQuantity);
		if(itemPrice==-1) { System.out.println("Invalid ID");
		}
		return billId;
	}
	
	public Store() {
		System.out.println("Please enter an id!");
	} 
	
	public Store(int itemId,int itemQuantity) {
		this.itemId=itemId;
		this.itemQuantity=itemQuantity;
		this.itemPrice=getPriceUsingIdx();
	}
}
public class RetailStore {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the item's id: ");
	int itemId=sc.nextInt();
	System.out.println("Enter the quantity of your item: ");
	int itemQuantity=sc.nextInt();
	Store Customer=new Store(itemId,itemQuantity);
	System.out.println("The Purchase id: " + itemId);
	System.out.println("The Quantity of the purchased item is: " +itemQuantity);
	System.out.println("Your bill is ready here, Kindly check !");
	System.out.println("Your bill amount is: " + Customer.getBill());
	sc.close();
	}
}
