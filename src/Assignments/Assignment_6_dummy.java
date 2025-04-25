package Assignments;

public class Assignment_6_dummy {

	public static void main(String[] args) {
		
		String[] studentsnew = {"Suresh", "Mahesh", "Naresh"};
		int[] marksnew = {75, 80, 82};

		int[] newMarks= {marksnew[0]+=10,marksnew[1]+=10,marksnew[2]+=10};
		System.out.println(newMarks[0]+", "+newMarks[1]+", "+newMarks[2]);
		
		int creditscore =646;
		int income =50000;
		if(creditscore>=750) {
		System.out.println("Loan automatically approved");}
		else if (creditscore>=650 && creditscore<750);{
		System.out.println("additional checks performed");}	
		if (creditscore < 650){
		System.out.println("Loan is denied");}
	
	}

}
