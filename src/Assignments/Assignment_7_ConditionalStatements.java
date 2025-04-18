package Assignments;

public class Assignment_7_ConditionalStatements {

    public static void main(String[] args) {
   // John's Credit score
        int creditscore = 760;
  // John's income
        int income = 55000;
  // John's Employment status
        boolean isEmployed = true;
  // John's Debt to Income ratio
        double DTIRatio = 35.00;

        if (creditscore >= 750) {
            System.out.println("Loan automatically approved on basis of credit score of John");
        } else if (creditscore >= 650 && creditscore < 750) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (DTIRatio <= 40.00) {
                        System.out.println("Loan is approved on basis of income, employment status and DTI Ratio");
                    } else {
                        System.out.println("Loan denied on basis of DTI Ratio");
                    }
                } else {
                    System.out.println("Loan denied on basis of Employment status");
                }
            } else {
                System.out.println("Loan denied on basis of insufficient income");
            }
        } else if (creditscore < 650) {
            System.out.println("Loan is denied due to bad credit score");
        }
    }
}