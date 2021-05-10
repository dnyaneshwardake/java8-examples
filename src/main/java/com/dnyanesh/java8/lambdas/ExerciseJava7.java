package com.dnyanesh.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dnyanesh.java8.basics.Employee;

public class ExerciseJava7 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Dnyanesh", 28, 130000);
		Employee e2 = new Employee("Gokul", 24, 10000);
		Employee e3 = new Employee("Santosh", 32, 140000);
		Employee e4 = new Employee("Vilas", 22, 70000);
		Employee[] emps = { e1, e2, e3, e4 };
		List<Employee> employees = Arrays.asList(emps);

		// Step 1 sort list by name
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		// Step 2 create methods that prints all elements from list
		printAll(employees);

		// Step 3 print name startin with D
		Condition condition = new Condition() {

			@Override
			public Boolean testCondition(Employee e) {
				return e.getName().startsWith("S");
			}
		};

		printConditionally(employees, condition);

	}

	private static void sortByName(List<Employee> employees) {
		// TODO Auto-generated method stub

	}

	private static void printAll(List<Employee> employees) {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	private static void printConditionally(List<Employee> employees, Condition condition) {
		for (Employee e : employees) {
			if (condition.testCondition(e)) {
				System.out.println(e);
			}
		}
	}

}

interface Condition {
	Boolean testCondition(Employee e);
}