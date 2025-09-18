package com.array;

import java.util.Arrays;

public class InsertAndDeleteAtIndex {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7};
	a=deleteArray(a,3);
	System.out.println(Arrays.toString(a));
//	int[] b=insertArray(a,2,3);
//	System.out.println(Arrays.toString(b));
}

private static int[] insertArray(int[] a, int ele, int index) {
	int[] b=new int[a.length+1];
	for(int i=0;i<index;i++)
	{
		b[i]=a[i];
	}
	b[index]=ele;
	for(int i=index;i<a.length;i++)
	{
		b[i+1]=a[i];
	}
	return b;
}

private static int[] deleteArray(int[] a, int index) {
	int[] b=new int[a.length-1];
	for(int i=0,j=0;i<a.length;i++)
	{
	    if(i==index)
		continue;
	b[j++]=a[i];
	}
	return b;
}
}
