package Thursdaylab;

import java.util.Scanner;

 class EmployeeSalary{
	int id;
	float bs, as, ta;
	String name, designation;

	void details(int id, String name, String designation, float ta, float bs) // parameter variable
	{
		this.id = id;
		this.name = name;
		this.bs = bs;
		this.designation = designation;
		this.ta = ta;

	}

	void annualSalary() // method
	{
		String position = "manager";
		if (designation.equals(position)) {
			as = bs * 12;
			as += ta;
		}

		else {
			as = bs * 12;
			as += ta;
		}
	}

	void display() // method
	{
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Designation:" + designation);
		System.out.println("Travel Allowance:" + ta);
		System.out.println("Annual Salary of Employee with TA:" + as);
	}

}

public class Employee{
	public static void main(String[] args) {
		int id;
		String name, designation;
		float bs, ta;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee id:");
		id = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Employee name:");
		name = sc.nextLine();
		System.out.print("Enter Employee Designation:");
		designation = sc.nextLine();
		System.out.print("Enter Travel Allowance:");
		ta = sc.nextFloat();
		System.out.print("Enter Employee Monthly Basic Salary:");
		bs = sc.nextFloat();
		System.out.println("-------------------------------------");

		EmployeeSalary obj = new EmployeeSalary();
		obj.details(id, name, designation, ta, bs);
		obj.annualSalary();
		obj.display();
	}

}
