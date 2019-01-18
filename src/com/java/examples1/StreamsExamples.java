package com.java.examples1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {

	public static void main(String args[]) {

		final StreamsExamples examples = new StreamsExamples();
		examples.example1();
		examples.example2();
		examples.example3();
		// examples.example4();
		examples.example5();
		examples.example6();
		examples.example7();
		examples.streamToList();
		examples.streamToArray();
		examples.example8();
		examples.convertPrimitiveStreamToCollector();
		examples.getMax();
		examples.getMin();

	}

	public void convertPrimitiveStreamToCollector() {

		final List<Integer> list = IntStream.of(1, 4, 5, 6, 7, 3).boxed().collect(Collectors.toList());
		System.out.println(list);

		final List<Integer> strings = Stream.of(1, 45, 5, 3).collect(Collectors.toList());
		System.out.println(strings);
	}

	public void example1() {
		final Stream<String> stream = Stream.of("Jasmine", "Lotus", "Rose", "Rose1");
		stream.forEach(s -> System.out.println(s));
	}

	public void example2() {

		final Stream<String> stream = Stream.of(new String[] { "Idli", "wada", "dosa" });
		stream.forEach(System.out::println);
	}

	public void example3() {

		final List<Integer> list = new LinkedList();

		for (int i = 0; i < 12; i++) {
			list.add(i);
		}

		final Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
	}

	public void example4() {

		final Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		});
		stream.forEach(System.out::println);
	}

	public void example5() {

		final List<Integer> list = Arrays.asList(1, 3, 5, 6, 7, 8);
		final IntSummaryStatistics stat = list.stream().mapToInt(a -> a).summaryStatistics();
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getAverage());
		System.out.println(stat.getCount());
		System.out.println(stat.getSum());

		final int sum = sumStream(list);
		System.out.println("Sum from sumStream mehtod" + sum);

	}

	public void example6() {

		final List<String> list = Arrays.asList("", "hello", "hi", "hru", "");
		final int noOfEmptyStrings = (int) list.stream().filter(l -> l.isEmpty()).count();
		System.out.println(noOfEmptyStrings);

		final long emptyStrings = list.parallelStream().filter(a -> a.isEmpty()).count();
		System.out.println(emptyStrings);

		final List addEmptyStringsInOtherList = list.parallelStream().filter(a -> a.isEmpty())
				.collect(Collectors.toList());
		addEmptyStringsInOtherList.forEach(a -> System.out.println("empty strings is" + a));

		final String mergedString = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

	}

	public void example7() {

		final IntStream stream = "12345_abcdefg".chars();
		stream.forEach(System.out::println);

		final Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
		stream1.forEach(p -> System.out.println(p));
	}

	public void example8() {

		final List<String> list = Arrays.asList("hi", "hello", "hru", "jasmine", "lotus");
		final boolean result = list.stream().anyMatch(a -> a.startsWith("h"));
		System.out.println(result);

		final String anyMatch = list.stream().findAny().filter(a -> a.startsWith("h")).get();
		System.out.println(anyMatch);

		final boolean result1 = list.stream().allMatch(a -> a.startsWith("h"));
		System.out.println(result1);

		final String firstString = list.stream().findFirst().filter(a -> a.startsWith("h")).get();
		System.out.println(firstString);

		final List uppercaseString = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseString);

		final List uppercaseSortedString = list.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseSortedString);

	}

	public void getMax() {

		final Integer s = Stream.of(1, 3, 4, 5, 4, 40).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(s);
	}

	public void getMin() {
		final Integer result = Stream.of(3, 5, 1, 5, 7, 32).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(result);
	}

	public void streamToArray() {

		final List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		final Integer[] arr = list.stream().filter(a -> a % 2 == 0).toArray(Integer[]::new);
		for (final Integer a : arr) {
			System.out.println(a);
		}
	}

	public void streamToList() {

		final List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		final List<Integer> evenNumbers = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumbers);

	}

	public int sumStream(List<Integer> li) {

		return li.stream().mapToInt(a -> a).sum();

	}
}
