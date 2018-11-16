package com.java.examples;

public interface Sample {
	
	  int a=0;

       void example1() ;
       
       default void example2() {
    	   
    	   System.out.println("Default method example2");
	}
    	  
 
	
}
