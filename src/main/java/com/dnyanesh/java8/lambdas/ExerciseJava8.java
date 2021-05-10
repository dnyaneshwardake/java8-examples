package com.dnyanesh.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dnyanesh.java8.basics.Employee;

public class ExerciseJava8 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Dnyanesh", 28, 130000);
		Employee e2 = new Employee("Gokul", 24, 10000);
		Employee e3 = new Employee("Santosh", 32, 140000);
		Employee e4 = new Employee("Vilas", 22, 70000);
		Employee[] emps = { e1, e2, e3, e4 };
		List<Employee> employees = Arrays.asList(emps);

		// Step 1 sort list by name
		Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		// Step 2 create methods that prints all elements from list
		printConditionally(employees, p -> true, p -> System.out.println(p));

		// Step 3 print name startin with D
		// Conditional condition = e -> e.getName().startsWith("S");
		System.out.println("Printin COnditionally S");
		printConditionally(employees, e -> e.getName().startsWith("S"), p -> System.out.println(p.getName()));

	}

	private static void printConditionally(List<Employee> employees, Predicate<Employee> predicate,
			Consumer<Employee> consumer) {
		for (Employee e : employees) {
			if (predicate.test(e)) {
				consumer.accept(e);
			}
		}
	}

}