package language.basics;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class CommentsInJava {

	public static void main(String[] args) {
		// Print the content and then go to next line
	       System.out.println("Hello, World!");
	       System.out.println("Hello, Mega!");
	       
	       // Print the content and then stay on same line
	       System.out.print("Hello,");
	       System.out.print(" World!");
	       System.out.println();
	       
	       // Print the formated content and then stay on same line
	       System.out.printf("%s is completed Btech, empId is %d and visa status is %b","Chandra",1236,false);
	       System.out.println();
	       
	       // Format the digits and then Print the formated content and then stay on same line
	       System.out.format("Total Bill is %.2f %n",100.93543539);
	       System.out.println();
	       
	       // Join multiple print statements together
	       System.out.append("My Name is Saumyaranjan").append(", My emp id is 1234");
	       System.out.println();
	       
	       // Print the char based on ASCII value
	       System.out.write(65);
	       System.out.println();
	    // Print Logs of Program
	       Logger log = Logger.getLogger("MyLogger");
	       log.info("Current line is 34");
	       log.warning("There is some warning at line 34, Please check");
      
	       PrintWriter writer = new PrintWriter("C:\\Training\\Mar_2025_930PM\\AutomationTraining\\AutomationProject\\Logs.txt");
	       writer.println(LocalDateTime.now()+"Currently Line 40 is running");
	       writer.println(LocalDateTime.now()+"Currently Line 41 is running");
	       writer.println(LocalDateTime.now()+"Execution is compled");
	       writer.close();

	}

}
