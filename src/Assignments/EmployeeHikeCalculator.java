package Assignments;

import java.util.*;

class Employee {
    String name;
    double baseSalary;
    double experience;
    double rating;

    // Constructor
    public Employee(String name, double baseSalary, double experience, double rating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.experience = experience;
        this.rating = rating;
    }
}

public class EmployeeHikeCalculator {
    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice Johnson", 75000.0, 5.1, 4.2),
            new Employee("Bob Smith", 68000.0, 3.2, 3.8),
            new Employee("Carol Davis", 82000.0, 7.1, 4.5),
            new Employee("David Brown", 90000.0, 10.2, 2.5),
            new Employee("Eva Green", 60000.0, 2.4, 3.5)
        );

        // Step 2: Define hike rules
        Map<String, Double> hikePercentageMap = new HashMap<>();
        for (Employee emp : employees) {
            double hikePercentage = 0.0;

            // Rating-based hike
            if (emp.rating >= 4.0) {
                hikePercentage = 15.0;
            } else if (emp.rating >= 3.0 && emp.rating < 4.0) {
                hikePercentage = 10.0;
            } else {
                hikePercentage = 3.0;
            }

            // Experience-based extra reward
            if (emp.experience >= 5) {
                System.out.println("Extra perks of 5000 added to " + emp.name);
            }

            // Store in map
            hikePercentageMap.put(emp.name, hikePercentage);
        }

        // Step 3: Print the hike percentage map
        System.out.println("Employee Hike Percentages:");
        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "%");
        }
    }
}