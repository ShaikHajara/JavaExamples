package com.java.examples1;

public class SplitString {
	String arr[];
	public void split(String str,String delimeter) {
       arr=str.split(delimeter);
	   for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }       
	}
	
	
	
	public static void main(String args[]) {
		SplitString s=new SplitString();
		s.split("jan-feb-mar-june","-");
		s.split("Hello:Hi:H r u", ":");
		s.split("13/10/1238", "/");
		s.split("Sun.Mon.Tue", "\\.");
	}

}
