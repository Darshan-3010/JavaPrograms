package com.array;

import java.util.Arrays;

//copy elements of an one array int another
public class CopyArray {
public static void main(String[] args) {
	int[] ar= {25,56,78,39,72};
//	int br[]=ar.clone();
//	int br[] = Arrays.copyOf(ar, ar.length);
	int[] br= new int[ar.length];
	for(int i=0;i<ar.length;i++)
	{
		br[i]=ar[i];
	}
	System.out.println(Arrays.toString(br));
}
}
