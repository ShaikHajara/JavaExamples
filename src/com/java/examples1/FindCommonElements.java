package com.java.examples1;

import java.util.ArrayList;

public class FindCommonElements {
	
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();

	public void findCommonElementsInArray() {
		list1.add("Helo");
		list1.add("Hi");
		list1.add("How are you");
		list1.add("where are you");
		list2.add("Hello");
		list2.add("what doing");
		list2.add("hello how are you");
		list2.add("hi how are you");
		list2.add("nill");
		list1.retainAll(list2);
		for(int i=0;i<=list1.size()-1;i++) {
		System.out.println(list1.get(i));
		}
	}
	
	public static void main(String args[]) {
		FindCommonElements ele=new FindCommonElements();
		ele.findCommonElementsInArray();
	}
	
}
