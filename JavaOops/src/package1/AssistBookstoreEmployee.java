//Solution No 18
package package1;
import java.util.Scanner;
class BookStore {
	private String bookTitle;
	private String authorName;
	private double bookPrice;
	private int bookYear;
	
	public BookStore(String bookTitle,String authorName,double bookPrice,int bookYear) {
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
		this.bookYear=bookYear;
	}
	
	public BookStore() {
		System.out.println();
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookAuthorName() {
		return authorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public int getBookYear() {
		return bookYear;
	}
}

public class AssistBookstoreEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your preference: ");
		int ChooseBook=sc.nextInt();
		BookStore bookTrack1 = new BookStore("Daniel defoe", "Robinson Crusoe",15.50,1719);
		BookStore bookTrack2 = new BookStore("Joseph conrad", "Heart of Darkness",12.80,1902);
		BookStore bookTrack3 = new BookStore("Pat Conroy","Beach Music",9.50,1996);
	    
		if(ChooseBook==1) {
			System.out.println("The informations regarding the book are: ");
			System.out.println("Book Title: " + bookTrack1.getBookTitle());
			System.out.println("Book Author's Name: " + bookTrack1.getBookTitle());
			System.out.println("Book Price: " + bookTrack1.getBookPrice());
			System.out.println("Year of Publication: " +bookTrack1.getBookYear());
		}
		else if(ChooseBook==2) {
			System.out.println("The informations regarding the book are: ");
			System.out.println("Book Title: " + bookTrack2.getBookTitle());
			System.out.println("Book Author's Name: " + bookTrack2.getBookTitle());
			System.out.println("Book Price: " + bookTrack2.getBookPrice());
			System.out.println("Year of Publication: " +bookTrack2.getBookYear());
		}
		else if(ChooseBook==3) {
			System.out.println("The informations regarding the book are: ");
			System.out.println("Book Title: " + bookTrack3.getBookTitle());
			System.out.println("Book Author's Name: " + bookTrack3.getBookTitle());
			System.out.println("Book Price: " + bookTrack3.getBookPrice());
			System.out.println("Year of Publication: " +bookTrack3.getBookYear());
		}
		else {
			System.out.println("We will add new book soon, Thankyou!");
		}
		sc.close();
	}
}
