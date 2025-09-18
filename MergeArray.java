package com.array;

import java.util.Arrays;

//merge two arrays into a single array
public class MergeArray {
public static void main(String[] args) {
	int[] ar1= {1,2,3,4};
	int[] ar2= {5,6,7,8};
	int[] merge=new int[ar1.length+ar2.length];
	for(int i=0;i<ar1.length;i++)
	{
		merge[i]=ar1[i];
	}
	int k=ar1.length;
	for(int i=0;i<ar2.length;i++)
	{
		merge[k]=ar2[i];
		k++;
	}
	for(int i=0;i<merge.length;i++)
	{
		System.out.print(merge[i]+" ");
	}
	System.out.println();
	System.out.println(Arrays.toString(merge));
}
}
