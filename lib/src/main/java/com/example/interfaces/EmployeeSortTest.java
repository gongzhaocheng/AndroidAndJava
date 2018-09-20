package com.example.interfaces;

import java.util.Arrays;

/*
*This program demonstrates the use of Comparaable interface
*@version 1 2018-09-17
* @author cgz
 */
public class EmployeeSortTest {


	public static void main(String... args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("xieyu", 10000);
		staff[1] = new Employee("chengpeng", 15000);
		staff[2] = new Employee("cgz", 7000);

		Arrays.sort(staff);

		//print out information about all Employee objects
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

		}
	}
}
