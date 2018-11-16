package com.java.examples1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sortAnArray {
	int arr[]= {-1,-3,4,6,-6,3,2,0};
	
	public void sortArray() {		
		Arrays.sort(arr);
		print(arr);	
		System.out.println("");
		
	}
	
	public void findElement() {
		findElementInArray(arr,2);
	}
	
	public void insertInArray() {
		System.out.println(arr.length);
		boolean result=findElementInArray(arr,10);
		System.out.println(result);
		if(result==false) {
			System.out.println("Element doesn't exists in arrays");
			arr=insertInToArray(arr,10,2);
		}
		else {
			System.out.println("Element exists in array");
		}
		sortArray();
	}
	
	public Boolean  findElementInArray(int arr[],int element) {
		//int index=Arrays.binarySearch(arr, element);
	    Boolean result=IntStream.of(arr).anyMatch(x->x==element);
	    return result;
		
	}
	public void print(int arr[]) {		
		for(int i=0;i<=arr.length-1;i++) {		
			if(i!=0) {
				System.out.print(",");
			}			
			System.out.print(arr[i]);
		}
	}
	
	public int[] insertInToArray(int source[],int element,int index) {
		
		int len=source.length;
		int dest[]=new int[len+1];
		System.arraycopy(source, 0, dest, 0, index);
		dest[index]=element;
		System.arraycopy(source, index, dest, index+1, len-index);
		return dest;
		
	}
	public static void main(String args[]) {
		sortAnArray s=new sortAnArray();
		s.sortArray();
		s.findElement();
		s.insertInArray();
	}
	
}
