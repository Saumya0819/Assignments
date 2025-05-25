package Assignments;

import java.util.Scanner;

public class Assignment_13_PrimenumberwithscannerMethod {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); // Create Scanner object

	        System.out.print("Enter a number: "); // Prompt user
	        int number = scanner.nextInt(); // Read integer input

	        // Call function to check if number is prime
	        boolean isPrime = isPrime(number);

	        // Output the result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close(); // Always close the Scanner
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false; // 0, 1, and negatives are not prime
	        }

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; // Found a divisor, not prime
	            }
	        }

	        return true; // No divisors found, it's prime
	    }
	}

