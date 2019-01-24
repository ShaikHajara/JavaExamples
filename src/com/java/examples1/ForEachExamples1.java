package com.java.examples1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachExamples1 {
	
	public static void iterate(List list) {
		
		Consumer<String> consumer=new Consumer<String>() {
			public void accept(String name) {
				System.out.println(name);
			}
		};
		list.forEach(consumer);
	}
	
	public void execute() {
		
		List list1=Arrays.asList("String1","String2","String3","String4");
		iterate(list1);
	}

	
	
	public static void main(String args[]) {
		
		ForEachExamples1 ex=new ForEachExamples1();
		ex.execute();
		
	}
}
