package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> Studentrow1=new HashMap<String, String>();
		Studentrow1.put("Name","John Doe");
		Studentrow1.put("Age","20");
		Studentrow1.put("Gender","Male");
		Studentrow1.put("Roll Number","S12345");
		Studentrow1.put("Grade","A");
		Studentrow1.put("Major","Computer Science");
		Studentrow1.put("GPA","3.8");
		Studentrow1.put("Email","john@example.com");
		Studentrow1.put("Contact Number","9876543210");
		Studentrow1.put("Address","123 Elm St"); 
		
		Map<String, String> Studentrow2=new HashMap<String, String>();
		Studentrow2.put("Name","Jane Smith");
		Studentrow2.put("Age","21");
		Studentrow2.put("Gender","Female");
		Studentrow2.put("Roll Number","S12346");
		Studentrow2.put("Grade","B");
		Studentrow2.put("Major","Mathematics");
		Studentrow2.put("GPA","3.5");
		Studentrow2.put("Email","jane@example.com");
		Studentrow2.put("Contact Number","9876543211");
		Studentrow2.put("Address","456 Oak St");  
		
		Map<String, String> Studentrow3=new HashMap<String, String>();
		Studentrow3.put("Name","Mike Brown");
		Studentrow3.put("Age","22");
		Studentrow3.put("Gender","Male");
		Studentrow3.put("Roll Number","S12347");
		Studentrow3.put("Grade","A");
		Studentrow3.put("Major","Physics");
		Studentrow3.put("GPA","3.9");
		Studentrow3.put("Email","mike@example.com");
		Studentrow3.put("Contact Number","9876543212");
		Studentrow3.put("Address","789 Pine St"); 
		
		Map<String, String> Employeerow1=new HashMap<String, String>();
		Employeerow1.put("Employee ID","E001");
		Employeerow1.put("Name","Alice Green");
		Employeerow1.put("Age","30");
		Employeerow1.put("Gender","Female");
		Employeerow1.put("Department","Engineering");
		Employeerow1.put("Position","Software Engineer");
		Employeerow1.put("Salary","75,000");
		Employeerow1.put("Email","alice@example.com");
		Employeerow1.put("Contact Number","9876543213");
		
		Map<String, String> Employeerow2=new HashMap<String, String>();
		Employeerow2.put("Employee ID","E002");
		Employeerow2.put("Name","Bob Johnson");
		Employeerow2.put("Age","35");
		Employeerow2.put("Gender","Male");
		Employeerow2.put("Department","Marketing");
		Employeerow2.put("Position","Marketing Manager");
		Employeerow2.put("Salary","85,000");
		Employeerow2.put("Email","bob@example.com");
		Employeerow2.put("Contact Number","9876543214");
		
		Map<String, String> Employeerow3=new HashMap<String, String>();
		Employeerow2.put("Employee ID","E003");
		Employeerow2.put("Name","Carol White");
		Employeerow2.put("Age","28");
		Employeerow2.put("Gender","Female");
		Employeerow2.put("Department","Sales");
		Employeerow2.put("Position","Sales Executive");
		Employeerow2.put("Salary","65,000");
		Employeerow2.put("Email","carol@example.com");
		Employeerow2.put("Contact Number","9876543215");
		
		Map<String, String> Productrow1=new HashMap<String, String>();
		Productrow1.put("Product ID","P001");
		Productrow1.put("Name","Laptop");
		Productrow1.put("Category","Electronics");
		Productrow1.put("Price","$1,200");
		Productrow1.put("Stock Quantity","50");
		Productrow1.put("Supplier","Tech Supplies");
		Productrow1.put("Warranty","2 years");
		Productrow1.put("Rating","4.5");
		Productrow1.put("Manufacturing Date","1/15/2023");
		Productrow1.put("Expiry Date","1/15/2025"); 
		
		Map<String, String> Productrow2=new HashMap<String, String>();
		Productrow2.put("Product ID","P002");
		Productrow2.put("Name","Desk Chair");
		Productrow2.put("Category","Furniture");
		Productrow2.put("Price","$150");
		Productrow2.put("Stock Quantity","100");
		Productrow2.put("Supplier","Office Depot");
		Productrow2.put("Warranty","1 years");
		Productrow2.put("Rating","4");
		Productrow2.put("Manufacturing Date","2/10/2023");
		Productrow2.put("Expiry Date","N/A"); 
		
		Map<String, String> Productrow3=new HashMap<String, String>();
		Productrow3.put("Product ID","P003");
		Productrow3.put("Name","Coffee Maker");
		Productrow3.put("Category","Kitchen");
		Productrow3.put("Price","$75");
		Productrow3.put("Stock Quantity","200");
		Productrow3.put("Supplier","KitchenWorld");
		Productrow3.put("Warranty","6 months");
		Productrow3.put("Rating","4.2");
		Productrow3.put("Manufacturing Date","3/20/2023");
		Productrow3.put("Expiry Date","3/20/2024"); 
		
		List<Map<String,String>> Studentslist=new ArrayList<Map<String,String>>();
		Studentslist.add(Studentrow1);
		Studentslist.add(Studentrow2);
		Studentslist.add(Studentrow3); 
		
		List<Map<String,String>> Employeelist=new ArrayList<Map<String,String>>();
		Employeelist.add(Employeerow1);
		Employeelist.add(Employeerow2);
		Employeelist.add(Employeerow3);
		
		List<Map<String,String>> Productlist=new ArrayList<Map<String,String>>();
		Productlist.add(Productrow1);
		Productlist.add(Productrow2);
		Productlist.add(Productrow3);
		
		Map<String, List<Map<String,String>>> finallist=new HashMap<String, List<Map<String,String>>>();
		finallist.put("STUDENTS", Studentslist);
		finallist.put("EMPLOYEES", Employeelist);
		finallist.put("PRODUCTS", Productlist); 
		
		// Get method is Pending
	}

}
