package com.example.interfaces;

import java.awt.geom.Path2D;

public class Employee implements Comparable<Employee> {
 	private  String name;
 	private  double salary;

 	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName(){
 		return name;
	}

	public double getSalary(){
 		return salary;
 	}

 	public void raiseSalary(double byPercent){

 		double raise = salary * byPercent/100;
 		salary += raise ;
 	}

 	/*
 	* 比较雇员工资
 	* @param other another Employee object
 	* @return negative value if employee has a lower salary than other Object,工资相同返回0，工资多返回positive
 	* */

 	public int compareTo(Employee other){
 		return Double.compare(salary,other.salary);
	}

}
