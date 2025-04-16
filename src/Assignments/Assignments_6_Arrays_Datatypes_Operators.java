package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignments_6_Arrays_Datatypes_Operators {

	public static void main(String[] args) {
		
		String[][] studentdetails = {{"Suresh","Mahesh","Naresh"},{"75","80","82"}};
	
		System.out.println("students name and mark of"+ " "+ studentdetails[0][0] + " is "+ studentdetails[1][0]);

		List<String> Studentnames = new ArrayList<String>();	
		Studentnames.add("Suresh");
		Studentnames.add("Mahesh");
		Studentnames.add("Naresh");
		List<String> Studentmarks = new ArrayList<String>();
		Studentmarks.add("75");
		Studentmarks.add("80");
		Studentmarks.add("82");
		
System.out.println(Studentnames.get(0) +":"+ Studentmarks.get(0));
System.out.println(Studentnames.get(1) +":"+ Studentmarks.get(1));		
System.out.println(Studentnames.get(2) +":"+ Studentmarks.get(2));

String[] students = {"Suresh", "Mahesh", "Naresh"};
int[] marks = {75, 80, 82};
//Adding 10 marks
int x= marks[0]+=10;
int y= marks[1]+=10;
int z= marks[2]+=10;
int Average = (x+y+z)/3;

System.out.println(Average); //Average of updated marks
System.out.println(x+","+ y +", "+ z);





	}

}
