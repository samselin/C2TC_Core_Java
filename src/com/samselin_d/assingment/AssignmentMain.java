package com.samselin_d.assingment;

import com.samselin_d.assingment.employees.*;

import com.samselin_d.assingment.utilities.*;


public class AssignmentMain {

	public static void main(String[] args)
	{
		
	
          Developer dev = new Developer("sam",20,Employee.totalEmployees+1,30000.00,"samselin",2);
          
          System.out.println(EmployeeUtilities.gitHubLink(dev));
          
          Manager man = new Manager("selin",20,Employee.totalEmployees+1,45684.00,"fire",3,6);
         
          System.out.println(EmployeeUtilities.salaryDifference(dev, man));
          
          EmployeeUtilities.printBasicDetails(man);
          
	}

}
