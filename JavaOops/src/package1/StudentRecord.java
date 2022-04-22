//Solution No 24
package package1;
import java.util.*;
class StudentNamesId {
	//String stuName;
	//String stuId;
	static String studentName[] = {"Prachi","Athrava","Disha","Prathmesh","Kartik"};
	static int studentId[] = {5001,3001,2001,1001,4001};
	
	public void NamesInAlphaOrder() {
		//String studentName[] = new String[20];
		//int index=0;
		//studentName[index]=stuName.sc.nextInt();
		int sizeofStringArray=studentName.length;
		String temp=null;
		System.out.println("The Students Name are: " );
		for(int i=0;i<sizeofStringArray;i++) {
			
			System.out.println(studentName[i]);
		}
		for(int i=0;i<sizeofStringArray;i++) {
			for(int j=i+1;j<sizeofStringArray;j++) {
				if(studentName[i].compareTo(studentName[j]) > 0) {
					temp=studentName[i];
					studentName[i]=studentName[j];
					studentName[j]=temp;
				}
			}
		}
		System.out.println("After sorting Names in alphabetical order: ");
		for(int i=0;i<sizeofStringArray;i++) {
			System.out.println(studentName[i]);
		}
	}
	public void IdInSortedOrder() {
		//int studentId[]=new int[20];
		int sizeofIntArray=studentId.length;
		System.out.println("The Students ID's are: ");
		for (int i=0;i<sizeofIntArray;i++) {
			System.out.println(studentId[i]);
		}
		for(int i=0;i<sizeofIntArray;i++) {
			for(int j=i;j<sizeofIntArray;j++) {
				if(studentId[i] > studentId[j] ) {
					int temp=studentId[i];
					studentId[i]=studentId[j];
					studentId[j]=temp;
				}
			}
		}
		System.out.println("After sorting in Id's in ascending order: ");
		for(int i=0;i<sizeofIntArray;i++) {
			System.out.println(studentId[i]);
		}
	}
	
}
public class StudentRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentNamesId Student=new StudentNamesId();
		int choice;
		System.out.println("Enter your choice: " );
		choice =sc.nextInt();
		switch(choice) {
		case 1: {
			Student.NamesInAlphaOrder();
			break;
		}
		case 2: {
			Student.IdInSortedOrder();
			break;
		}
		default:
			System.out.println("Please enter a valid choice");
		}
		sc.close();
	}
}