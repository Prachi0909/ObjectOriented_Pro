package package1;
import java.util.*;
public class StudentHighestMarks {
	public static void main() {
		Scanner sc=new Scanner(System.in);
			int highestMark=0;
			String stuName[]=new String[20],x="";
			int stuId[]=new int[20];
			System.out.println("Enter the marks of 20 students: ");
			for(int i=0;i<20;i++) {
				System.out.print("Enter the name: ");
				stuName[i] = sc.nextLine();
				System.out.print("Enter the marks: ");
				stuId[i]=sc.nextInt();
				System.out.println();
				if(stuId[i]>highestMark) {
					x=stuName[i];
					highestMark=stuId[i];
				}
			}
			System.out.println("The Highest Mark's Student: " +x);
			System.out.println("The Highest Mark: " + highestMark);
			sc.close();
	}

}
