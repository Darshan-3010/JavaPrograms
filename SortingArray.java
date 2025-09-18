package com.array;

import java.util.Arrays;

public class SortingArray {
public static void main(String[] args) {
	int[] ar= {12,5,8,1,9};
	String st=Arrays.toString(ar);
	System.out.println(st);                   //Before Sorting
	Arrays.sort(ar);                          //Ascending Order
	System.out.println(Arrays.toString(ar));
	int f=0,l=ar.length-1;
	while(f<l)
	{
		int temp=ar[f];
		ar[f]=ar[l];
		ar[l]=temp;
		f++;
		l--;
	}
	System.out.println(Arrays.toString(ar)); //Descending order
}
}
