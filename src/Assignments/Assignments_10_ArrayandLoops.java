package Assignments;

public class Assignments_10_ArrayandLoops {
	
	
	public static void main(String[] args) {
	
		int [] numbers = {12 ,34,11,36,87,98,93};

	System.out.println("numbers"+":"+ numbers[0]);	
	
	 int largest = Integer.MIN_VALUE;
     int secondLargest = Integer.MIN_VALUE;
     int thirdLargest = Integer.MIN_VALUE;

	for (int number: numbers) {	
	  if (number >largest) {
		  thirdLargest=secondLargest;
		  secondLargest=largest;
		  largest=number;}
		  else if (number>secondLargest) {
			  thirdLargest=secondLargest;  
			  secondLargest=number;}
		  else if (number>thirdLargest) {
			  thirdLargest = number;	  
		  }
	  }
	System.out.println("Second Largest: " + secondLargest);
    System.out.println("Third Largest: " + thirdLargest);
	}

}
