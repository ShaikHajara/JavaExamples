package com.java.examples1;

public class RemoveCharFromStr {
	
	public String removeChar(String str,int position) {
		 System.out.println(str.substring(position+1));
         return str.substring(0,position)+str.substring(position+1);
	}
	
	public static void main(String args[]) {
		RemoveCharFromStr s=new RemoveCharFromStr();
		String removedCharString=s.removeChar("Hellow", 1);
		System.out.println(removedCharString);
		
	}

}
