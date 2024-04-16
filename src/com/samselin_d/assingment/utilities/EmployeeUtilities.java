package com.samselin_d.assingment.utilities;

import com.samselin_d.assingment.employees.*;

public class EmployeeUtilities {
    
	
	
	public static String gitHubLink(Developer dev) 
	{
		return "https://github.com/"+dev.githubUserName;
	}
	
	
	public static double salaryDifference(Employee emp1,Employee emp2) 
	{
		double empSalary1 =emp1.getSalary();
		double empSalary2 = emp2.getSalary();
		
		if(empSalary1 > empSalary2)
			return empSalary1-empSalary2;
		else
		   return empSalary2-empSalary1;
		
	}
	
	public static  void printBasicDetails(Employee emp) 
	{
		System.out.println("-----------------------------------");
		System.out.println("Employee Id : "+emp.getEmployeeId());
		System.out.println("Name : "+emp.name);
		System.out.println("Age : "+emp.getAge());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("-----------------------------------");
	}
	
	
}