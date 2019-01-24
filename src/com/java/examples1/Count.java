package com.java.examples1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {

	public static void main(String args[]) {
		final Count execute = new Count();
		execute.example();
	}

	public void example() {

		final List<String> flowers = Arrays.asList("Rose", "Sunflower", "Rose", "Jasmine", "Lotus");

		final Map<String, Long> map = flowers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}

}
