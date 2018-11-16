package com.java.examples;

public class SampleClass implements Sample{

	@Override
	public void example1() {
		// TODO Auto-generated method stub
		System.out.println("Override");
	}
	
	public static void main(String args[]) {
	Sample s=new SampleClass();
	s.example2();
	s.example1();
	
	}
	

}
