package com.java.examples1;

public class removeIntegerFromStr {
	
	public void removeInteger(String str) {		
		String integerRemovedString=str.replaceAll("[^a-z]","");
		System.out.println(integerRemovedString);
	}
	
	public static void main(String args[]) {
		removeIntegerFromStr s=new removeIntegerFromStr();
		s.removeInteger("hello23world1");
	}

}
