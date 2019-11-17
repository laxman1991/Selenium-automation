package com.arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

	int a[]= {10,20,30};
	
	String data[]= new String[a.length];
	for(int i=0;i<a.length;i++){
        data[i]=String.valueOf(a[i]);   
	}
    System.out.println(Arrays.toString(data));
	}
}
