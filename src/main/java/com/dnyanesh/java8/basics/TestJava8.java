package com.dnyanesh.java8.basics;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestJava8 {

	public static void main(String[] args) {
		Integer[] numbers = { 1, 6, 3, 9, 12, 9, 4, 5 };
		List<Integer> list = Arrays.asList(numbers);

		Employee e1 = new Employee("Dnyanesh", 28, 130000);
		Employee e2 = new Employee("Gokul", 24, 10000);
		Employee e3 = new Employee("Santosh", 32, 140000);
		Employee e4 = new Employee("Vilas", 22, 70000);
		Employee[] emps = { e1, e2, e3, e4 };
		List<Employee> employees = Arrays.asList(emps);

		// Largest # in Array or ArrayList
		System.out.println(list.stream().max((i, j) -> i.compareTo(j)).get());

		// Smallest # in Array or ArrayList
		System.out.println(list.stream().min((i, j) -> i.compareTo(j)).get());

		// Count of employee having age >25
		System.out.println(employees.stream().filter(e -> e.getAge() > 25).count());

		// Find the employee with name Gokul
		Employee emp = employees.stream().filter(e -> e.getName().equalsIgnoreCase("Gokul")).findAny().get();
		System.out.println(emp);

		// to get all employees with name Gokul
		List<Employee> collect = employees.stream().filter(e -> e.getName().equals("Gokul")).collect(Collectors.toList());
		System.out.println(employees.stream().filter(e -> e.getName().equals("Gokul")).collect(Collectors.toList()));

		// Find max age of employee
		OptionalInt maxAge = employees.stream().mapToInt(Employee::getAge).max();
		System.out.println(maxAge.getAsInt());

		// Print the all employee names from list of Employees
		System.out.println(employees.stream().map(Employee::getName).collect(Collectors.toList()));

		// Remove duplicate numbers form list
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		System.out.println(list.stream().collect(Collectors.toSet()));

		// square the all numbers and find average of numbers greater than 50
		System.out.println(list.stream().mapToInt(n -> n * n).filter(n -> n > 50).average());

	}

}