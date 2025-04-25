package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_8_Loopsandconditionalstatements {

    public static void main(String[] args) {
        // Step 1: Store transactions in a List
        List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        System.out.println("Transactions: " + transactions);

        // Step 2: Lists to store credit and debit transactions separately
        List<Integer> creditTransactions = new ArrayList<>();
        List<Integer> debitTransactions = new ArrayList<>();

        // Step 3: Initialize counters for total credits, debits, and suspicious transactions
        int totalCredits = 0;
        int totalDebits = 0;
        int suspiciousTransactions = 0;

        // Step 4: Categorize transactions using a loop
        for (int transaction : transactions) {
            if (transaction > 0) {
                creditTransactions.add(transaction);
                totalCredits += transaction;
                // Check for suspicious transactions
                if (transaction > 10000) {
                    System.out.println("Suspicious credit transaction with Amount: Rs " + transaction);
                    suspiciousTransactions++;
                }
            } else {
                debitTransactions.add(transaction);
                totalDebits += transaction;
                // Check for suspicious transactions
                if (transaction < -10000) {
                    System.out.println("Suspicious debit transaction with Amount: Rs " + transaction);
                    suspiciousTransactions++;
                }
            }
        }

   // Step 5: Display the results
        System.out.println("Credit Transactions: " + creditTransactions);
        System.out.println("Debit Transactions: " + debitTransactions);
        System.out.println("Total Amount Credited: Rs " + totalCredits);
        System.out.println("Total Amount Debited: Rs " + totalDebits);
        System.out.println("Total Amount in the Bank: Rs " + (totalCredits + totalDebits));
        System.out.println("Total Number of Suspicious Transactions: " + suspiciousTransactions);
    }
}