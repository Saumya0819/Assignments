package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_5_CollectionConcepts {

	public static void main(String[] args) {

//Store Students details from Table1 Row1		
	Map<String,String> studentsdetailsRow1 = new HashMap<String,String>();		
	studentsdetailsRow1.put("Name","John Doe");
    studentsdetailsRow1.put("Age","20");	
    studentsdetailsRow1.put("Gender","Male");	
    studentsdetailsRow1.put("Roll Number","S12345");
    studentsdetailsRow1.put("Grade","A");	
    studentsdetailsRow1.put("Major","Computer Science");	
    studentsdetailsRow1.put("GPA","3.8");
    studentsdetailsRow1.put("Email","john@example.com");
    studentsdetailsRow1.put("Contact Number","9876543210");
    studentsdetailsRow1.put("Address","123 Elm St");
//Store Students details from Table1 Row2
	Map<String,String> studentsdetailsRow2 = new HashMap<String,String>();		
	studentsdetailsRow2.put("Name","Jane Smith");
    studentsdetailsRow2.put("Age","21");	
    studentsdetailsRow2.put("Gender","Female");	
    studentsdetailsRow2.put("Roll Number","S12346");
    studentsdetailsRow2.put("Grade","B");	
    studentsdetailsRow2.put("Major","Mathematics");	
    studentsdetailsRow2.put("GPA","3.5");
    studentsdetailsRow2.put("Email","jane@example.com");
    studentsdetailsRow2.put("Contact Number","9876543211");
    studentsdetailsRow2.put("Address","456 Oak St");
 //Store Students details from Table1 Row3    
    Map<String,String> studentsdetailsRow3 = new HashMap<String,String>();		
	studentsdetailsRow3.put("Name","Mike Brown");
    studentsdetailsRow3.put("Age","22");	
    studentsdetailsRow3.put("Gender","Male");	
    studentsdetailsRow3.put("Roll Number","S12347");
    studentsdetailsRow3.put("Grade","A");	
    studentsdetailsRow3.put("Major","Physics");	
    studentsdetailsRow3.put("GPA","3.9");
    studentsdetailsRow3.put("Email","mike@example.com");
    studentsdetailsRow3.put("Contact Number","9876543212");
    studentsdetailsRow3.put("Address","789 Pine St");
    
//Store Employee details from Table2 Row1
    Map<String,String> empldetailsRow1 = new HashMap<String,String>();	
    empldetailsRow1.put("Employee ID","E001");
    empldetailsRow1.put("Name","Alice Green");
    empldetailsRow1.put("Age","30");
    empldetailsRow1.put("Gender","Female");
    empldetailsRow1.put("Department","Engineering");
    empldetailsRow1.put("Position","Software Engineer");
    empldetailsRow1.put("Salary","75,000");
    empldetailsRow1.put("Email","alice@example.com");
    empldetailsRow1.put("Contact Number","9876543213");
//Store Employee details from Table2 Row2
    Map<String,String> empldetailsRow2 = new HashMap<String,String>();	
    empldetailsRow2.put("Employee ID","E002");
    empldetailsRow2.put("Name","Bob Johnson");
    empldetailsRow2.put("Age","35");
    empldetailsRow2.put("Gender","Male");
    empldetailsRow2.put("Department","Marketing");
    empldetailsRow2.put("Position","Marketing Manager");
    empldetailsRow2.put("Salary","85,000");
    empldetailsRow2.put("Email","bob@example.com");
    empldetailsRow2.put("Contact Number","9876543214");
//Store Employee details from Table2 Row3
    Map<String,String> empldetailsRow3 = new HashMap<String,String>();	
    empldetailsRow3.put("Employee ID","E003");
    empldetailsRow3.put("Name","Carol White");
    empldetailsRow3.put("Age","28");
    empldetailsRow3.put("Gender","Female");
    empldetailsRow3.put("Department","Sales");
    empldetailsRow3.put("Position","Sales Executive");
    empldetailsRow3.put("Salary","65,000");
    empldetailsRow3.put("Email","carol@example.com");
    empldetailsRow3.put("Contact Number","9876543215");
    
//Store Employee details from Table3 Row1    
    Map<String,String> productdetailsRow1 = new HashMap<String,String>();
    productdetailsRow1.put("Product ID","P001");
    productdetailsRow1.put("Name","Laptop");
    productdetailsRow1.put("Category","Electronics");
    productdetailsRow1.put("Price","$1,200");
    productdetailsRow1.put("Stock Quantity","50");
    productdetailsRow1.put("Supplier","Tech Supplies");
    productdetailsRow1.put("Warranty","2 years");
    productdetailsRow1.put("Rating","4.5");
    productdetailsRow1.put("Manufacturing Date","1/15/2023");
    productdetailsRow1.put("Expiry Date","1/15/2025");
//Store Employee details from Table3 Row2     
    Map<String,String> productdetailsRow2 = new HashMap<String,String>();
    productdetailsRow2.put("Product ID","P002");
    productdetailsRow2.put("Name","Desk Chair");
    productdetailsRow2.put("Category","Furniture");
    productdetailsRow2.put("Price","$150");
    productdetailsRow2.put("Stock Quantity","100");
    productdetailsRow2.put("Supplier","Office Depot");
    productdetailsRow2.put("Warranty","1 year");
    productdetailsRow2.put("Rating","4");
    productdetailsRow2.put("Manufacturing Date","2/10/2023");
    productdetailsRow2.put("Expiry Date","N/A");
//Store Employee details from Table3 Row3
    Map<String,String> productdetailsRow3 = new HashMap<String,String>();
    productdetailsRow3.put("Product ID","P003");
    productdetailsRow3.put("Name","Coffee Maker");
    productdetailsRow3.put("Category","Kitchen");
    productdetailsRow3.put("Price","$75");
    productdetailsRow3.put("Stock Quantity","200");
    productdetailsRow3.put("Supplier","KitchenWorld");
    productdetailsRow3.put("Warranty","6 months");
    productdetailsRow3.put("Rating","4.2");
    productdetailsRow3.put("Manufacturing Date","3/20/2023");
    productdetailsRow3.put("Expiry Date","3/20/2024A");
    
    
  List<Map<String,String>> studentsList = new ArrayList <Map<String,String>>();
  studentsList.add(studentsdetailsRow1);
  studentsList.add(studentsdetailsRow2);
  studentsList.add(studentsdetailsRow3);
  
  List<Map<String,String>> employeeList = new ArrayList <Map<String,String>>();
  employeeList.add(empldetailsRow1);
  employeeList.add(empldetailsRow2);
  employeeList.add(empldetailsRow3);
  
  List<Map<String,String>> productList = new ArrayList <Map<String,String>>(); 
  productList.add(productdetailsRow1);
  productList.add(productdetailsRow2);
  productList.add(productdetailsRow3);
  
 Map<String,List<Map<String,String>>> finalList =new HashMap<String,List<Map<String,String>>>();
 finalList.put("Students", studentsList);
 finalList.put("Employees", employeeList);
 finalList.put("Products", productList);
 
 System.out.println(finalList.get(0));
    
    
		
	}

}
