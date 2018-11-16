package com.java.examples1;

public class ReverseStr {
	public static void main(String args[]) {
		ReverseStr s=new ReverseStr();
		s.reverse("Hellow");
	}
	
	public void reverse(String str) {		
		char a[]=str.toCharArray();		
		for(int i =a.length-1;i>=0;i--) {            
	
			System.out.println(a[i]);
		}
	}
	
}
