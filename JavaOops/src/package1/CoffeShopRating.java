//Solution No.21
package package1;
//import java.util.Scanner;
class CoffeeShop {
	private String Name;
	private String MobileNo;
	private double feedbackRating;
	static double[] arrayFeedback = new double[30];
	static int index=0;
	
	public CoffeeShop() {
		System.out.println("Invalid Id");
	}
	
	public CoffeeShop(String Name,String MobileNo,double feedbackRating) {
		this.Name=Name;
		this.MobileNo=MobileNo;
		arrayFeedback[index]=feedbackRating;
		index++;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setMobileNo(String MobileNo) {
		this.MobileNo=MobileNo;
	}
	
	public void setfeedbackRating(double feedbackRating) {
		this.feedbackRating=feedbackRating;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getMobileNo() {
		return MobileNo;
	}
	
	public static void getfeedbackRating() {
		for(int i=0;i<CoffeeShop.arrayFeedback.length;i++) {
			System.out.println(CoffeeShop.arrayFeedback[i]);
		}
	}
}
public class CoffeShopRating {
	public static void main(String[] args) {
		CoffeeShop Customer1 = new CoffeeShop("Prachi","7905765243",3);
		CoffeeShop Customer2 = new CoffeeShop("Disha","7905765243",4);
		CoffeeShop Customer3 = new CoffeeShop("Athrava","7905765243",5);
		CoffeeShop Customer4 = new CoffeeShop("Kartik","7905765243",2);
		CoffeeShop Customer5 = new CoffeeShop("Prathmesh","7905765243",5);
		System.out.println("Customer's Name: " + Customer1.getName());
		System.out.println("Customer's Mobile No: " + Customer1.getMobileNo());
		System.out.println("Customer's Name: " + Customer2.getName());
		System.out.println("Customer's Mobile No: " + Customer2.getMobileNo());
		System.out.println("Customer's Name: " + Customer3.getName());
		System.out.println("Customer's Mobile No: " + Customer3.getMobileNo());
		System.out.println("Customer's Name: " + Customer4.getName());
		System.out.println("Customer's Mobile No: " + Customer4.getMobileNo());
		System.out.println("Customer's Name: " + Customer5.getName());
		System.out.println("Customer's Mobile No: " + Customer5.getMobileNo());
	    CoffeeShop.getfeedbackRating();
	}
}
