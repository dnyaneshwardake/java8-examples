package com.dnyanesh.java8.basics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
	private String firstname;
	private Integer age;
	private long sal;
}
