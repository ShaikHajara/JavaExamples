package com.java.examples1;

public class SearchWord {
	
	public void searchWord(String str,String searchWord) {
		
		int index=str.indexOf(searchWord);
		if(index==-1) {
			System.out.println("String not founds");
		}
		else {
			System.out.println("String found at index"+" " +index);
		}
	}
	
	public static void main(String args[]) {
		SearchWord s=new SearchWord();
		s.searchWord("HelloWorld", "Word");
		
	}

}
