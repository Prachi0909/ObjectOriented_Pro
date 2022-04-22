//Solution No 25
package package1;
//import java.util.Scanner;
class StudentMarks {
	String stuName;
	int stuId;
	String stuBranch;
	int stuScore;

	public StudentMarks(String stuName,int stuId,String stuBranch,int stuScore) {
		this.stuName=stuName;
		this.stuId=stuId;
		this.stuBranch=stuBranch;
		this.stuScore=stuScore;
	}
    public static StudentMarks highestMark(StudentMarks[] students) {
		int maxSoFar=0;
		StudentMarks maxSoFarObj=null;
		for(int i=0;i<students.length;i++) {
			StudentMarks currMarkObj=students[i];
			int currMark=students[i].stuScore;
			if(maxSoFar < currMark) {
				maxSoFar = currMark;
				maxSoFarObj =  currMarkObj;
			}
		}
		return maxSoFarObj;
	}
		
}
public class StudentHasHighestMarks {
	public static void main(String[] args) {
        StudentMarks students[] = new StudentMarks[5];
        students[0] = new StudentMarks("Prachi",2001,"IT",450);
        students[1] = new StudentMarks("Prachi",2002,"IT",359);
        students[2] = new StudentMarks("Prachi",2003,"IT",280);
        students[3] = new StudentMarks("Prachi",2004,"IT",190);
        students[4] = new StudentMarks("Prachi",2005,"IT",389);
        for(int i=0;i<students.length;i++) {
             	System.out.println("Name: " +students[i].stuName);
		        System.out.println("ID: " +students[i].stuId);
		        System.out.println("Branch: " +students[i].stuBranch);
		        System.out.println("Score: " +students[i].stuScore);
        }
		//for(int i=0;i<students.length;i++) {
			//Scanner sc=new Scanner(System.in);
	        //System.out.println("Enter the Name of the students: ");
			//students[i].stuName=sc.nextLine();
			//System.out.println("Enter the Id of the students: ");
			//students[i].stuId=sc.nextInt();
			//System.out.println("Enter the Branch of the students: ");
			//students[i].stuBranch=sc.nextLine();
			//System.out.println("Enter the Score of the students: ");
			//students[i].stuScore=sc.nextInt();
				//	System.out.println("Name: " +students[i].stuName);
			      //  System.out.println("ID: " +students[i].stuId);
			        //System.out.println("Branch: " +students[i].stuBranch);
			        //System.out.println("Score: " +students[i].stuScore);
			  //sc.close();
	     //}
		System.out.println("The Highest Marks of the Student is: " 
	     +  StudentMarks.highestMark(students).stuScore  );
	}
}

