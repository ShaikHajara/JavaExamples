package com.java.examples1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExamples {

	public static void main(String args[]) {
		final ForEachExamples ex = new ForEachExamples();
		ex.addItems();
		ex.consumerExample();
	}

	public void addItems() {
		final List<String> items = new LinkedList<String>();
		items.add("hello");
		items.add("hi");
		items.add("hru");
		items.add("w r u");
		items.add("hru");
		items.forEach(item -> System.out.println(item));
		items.forEach(item -> {
			if (item.startsWith("h")) {
				System.out.println("starts with h : " + item);
			}

		});

		items.stream().filter(s -> s.contains("h")).forEach(System.out::println);
		final List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using forEach(Consumer action) to
		// print the elements of stream
		// in reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		items.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// generate random number
		Stream.generate(new Random()::nextInt).limit(4).forEach(System.out::println);

		// count
		final long counts = items.stream().count();
		System.out.println(counts);

		final int count1 = (int) items.stream().distinct().count();
		System.out.println(count1);

		items.forEach(i -> System.out.println(i.toUpperCase()));

	}

	public void consumerExample() {

		final List<Integer> list = new ArrayList(Arrays.asList(1, 3, 5, 6, 7, 8));

		final Consumer<Integer> action = i -> {
			if (i % 2 == 0) {
				System.out.println("Even Number" + i);
			} else {
				System.out.println("Odd number" + i);
			}
		};

		list.stream().forEach(action);

	}

}
