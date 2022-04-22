//Solution No 17
package package1;
import java.util.Scanner;
class Employee {
	private int empId;
	private String empName;
	private String empDesig;
	private String empDept;
	
	public void setempName() {
		if(empName.length() == 0) {
			System.out.println("Please enter appropriate name:");
		}
		else{
			System.out.println(empName);
		}
	}
	public String getempName() {
		return empName;
	}
	
	public void setempDesign(String empDesig) {
		if(empDesig == "Developer" || empDesig == "Tester" || empDesig == "Lead" || empDesig == "Manager") {
			this.empDesig=empDesig;
			//System.out.println("The Designation is: " + empDesig);
		}
		else if(empDesig != "Developer" || empDesig != "Tester" || empDesig != "Lead" || empDesig != "Manager") {
			System.out.println("Invalid Designation");
		}
	
	}
	
	public String getempDesign() {
		return empDesig;
	}
	
	public void setempDept(String empDept) {
		if(empDept == "TTH" || empDept == "RCM" || empDept == "Digital" || empDept == "DevOps" ) {
			this.empDept=empDept;
			//PSystem.out.println("The Department is: " + empDept);
		}
		else if(empDept != "TTH" || empDept != "RCM" || empDept != "Digital" || empDept != "DevOps"){
			System.out.println("Invalid Department");
		}
	}
	
	public String getempDept() {
		return empDept;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Employee() {
		System.out.println();
	}
	
	public Employee(int empId,String empName,String empDesig,String empDept) {
		this.empId=empId;
		this.empName=empName;
		this.empDesig=empDesig;
		this.empDept=empDept;
	}

	public int getEmpId() {
		return empId;
	}
}
public class EmployeeClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name: ");
		String empName=sc.nextLine();
		System.out.println("Enter the employee designation: " );
		String empDesig=sc.nextLine();
		System.out.println("Enter the employee department: ");
		String empDept=sc.nextLine();
		System.out.println("Enter the id of the employee: ");
		int empId=sc.nextInt();
		Employee Checking = new Employee(empId,empName,empDesig,empDept);
		System.out.println("Id is: " +empId);
		Checking.setempName();
		Checking.setempDesign(empDesig);
		Checking.setempDept(empDept);
		System.out.println("Name: " + empName +"\n" + "Id: " + empId +"\n" + "Designation: " + empDesig +"\n"+ "Department: " + empDept );
		
	sc.close();
	}
}
