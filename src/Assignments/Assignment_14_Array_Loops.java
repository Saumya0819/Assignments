package Assignments;

public class Assignment_14_Array_Loops {

	public static void main(String[] args) {
		 int n = 5; // Maximum number in the pyramid

	        // Upper half of the pyramid
	        for (int i = 1; i <= n; i++) {
	          
	            for (int s = n - i; s > 0; s--) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Lower half of the pyramid
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces for alignment
	            for (int s = n - i; s > 0; s--) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}