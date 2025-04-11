package language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		Employees obj =new Employees();
		System.out.println("Employee Name: " + obj.empname[0] +", "+ "Employee ID: "+ obj.empID[0]);
		System.out.println("Employee Name: " + obj.empname[1] +", "+ "Employee ID: "+ obj.empID[1]);
		System.out.println("Employee Name: " + obj.empname[2] +", "+ "Employee ID: "+ obj.empID[2]);
		System.out.println("Employee Name: " + obj.empname[1] +", "+ "Employee ID: "+ obj.empID[0]);
		System.out.println("Employee Name: " + obj.empname[0] +", "+ "Employee ID: "+ obj.empID[2]);
		System.out.println("Employee Name: " + obj.empname[2] +", "+ "Employee ID: "+ obj.empID[1]);

	}

}
