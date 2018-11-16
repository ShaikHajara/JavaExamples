package com.java.examples1;

import com.java.examples.Sample;

public class SampleClass2 implements Sample{
	
	@Override
	public void example1() {
		// TODO Auto-generated method stub
		System.out.println("Overridee");
	}
	
	public static void main(String args[]) {
	Sample s=new SampleClass2();
	s.example2();
	s.example1();
	
	}

}
