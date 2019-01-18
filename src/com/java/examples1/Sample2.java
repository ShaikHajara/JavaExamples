package com.java.examples1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample2 {

	public static void main(String args[]) {

		final Sample2 s = new Sample2();
		s.set();

	}

	final Object[][] obj = { { 1, 5 }, { 6, 4 }, { 4, 9 } };

	public void set() {

		final List<Object> list = new ArrayList<Object>();
		list.add(obj);
		list.add("hello");

		System.out.println(list.get(1));

		System.out.println(Arrays.deepToString(obj));

	}

}
