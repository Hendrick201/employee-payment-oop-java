package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Digite o numero de funcionarios");
		  int employersNumber = sc.nextInt();
		  sc.nextLine();
		  List<Employee> employeeList = new ArrayList<Employee>();
		  for(int i = 0; i < employersNumber; i ++)
		  {
			  System.out.printf("Employee #%d data: \n", i +1);
			  System.out.print("Outsourced (y/n)? ");
			  char response = sc.next().charAt(0);
			  sc.nextLine();
			  System.out.print("Name: ");
			  String employeeName = sc.nextLine();
			  System.out.print("Hours: ");
			  Double employeeHours = sc.nextDouble();
			  sc.nextLine();
			  System.out.print("Value per hour: ");
			  Double employeeValuePerHour = sc.nextDouble();
			  sc.nextLine();
			  if(response == 'y')
			  {
				  System.out.print("Additional charge: ");
				  Double employeeAdditionalCharge = sc.nextDouble();
				  sc.nextLine();
		
				  employeeList.add(new OutsourcedEmployee(employeeName,employeeHours,employeeValuePerHour,employeeAdditionalCharge));
			  }
			  else
			  {
				  
				  employeeList.add(new Employee(employeeName,employeeHours,employeeValuePerHour));
			  }
			 
		  }
		  System.out.println("PAYMENTS:");
		  for(int j = 0; j < employeeList.size(); j ++)
		  {
			System.out.println(employeeList.get(j).toString());  
		  }
		  sc.close();
	}
}
