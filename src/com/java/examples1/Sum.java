package com.java.examples1;

public class Sum {
	
	int sum=0;
	public void sum() {
		for(int i=1;i<=1100;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
	
	public void otherApprochSum() {
		int n;
		for(n=1;n<=100;n++) {
			int c=n+1;
			
			int sum=n*c/100;
		}
		System.out.println(sum);
	}
	

	public static void main(String args[]) {
		Sum s=new Sum();
		s.sum();
		s.otherApprochSum();
	}
}
