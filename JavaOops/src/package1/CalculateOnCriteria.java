//Solution No 23
package package1;
class Student{
	public int studentId;
	public String studentName;
	public float marks;
	public boolean secondChance;
	
	public Student() {
		System.out.println("Invalid");
	}
	public Student(int studentId,String studentName,boolean secondChance) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.secondChance=secondChance;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public boolean getSecondChance() {
		return secondChance;
	}
	
	public void identifyMarks(float marks) {
		if(secondChance==false) {
			this.marks=marks;
		}
	}
	
    public void identifyMarks(float firstMarks,float secondMarks) {
		if(secondChance==true) {
			if(firstMarks>secondMarks) {
				marks=firstMarks;
				System.out.println(firstMarks);
			}
			else {
				System.out.println(secondMarks);
			}
		}
	}
}
public class CalculateOnCriteria {
	public static void main(String[] args) {
		Student studentRec1 = new Student(2001,"Prachi",true);	
		studentRec1.identifyMarks(218,345);
		System.out.println("The Record of Student 1: \n");
		System.out.println(studentRec1.getStudentId());
		System.out.println(studentRec1.getStudentName());
		System.out.println(studentRec1.getMarks());
		System.out.println(studentRec1.getSecondChance());
		System.out.println("\n");
		
		
		Student studentRec2 = new Student(2002,"Prachi",false);
		studentRec2.identifyMarks(360);
		System.out.println("The Record of Student 2: \n");
		System.out.println(studentRec2.getStudentId());
		System.out.println(studentRec2.getStudentName());
		System.out.println(studentRec2.getMarks());
		System.out.println(studentRec2.getSecondChance());
		System.out.println("\n");
		
	}
}


