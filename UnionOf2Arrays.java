package com.array;

import java.util.Arrays;

public class UnionOf2Arrays {
public static void main(String[] args) {
	int[] a= {1,2,3};
	int[] b= {3,4,5};
	int[] merge=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		merge[i]=a[i];
	}
	int in=a.length;
	for(int i=0;i<b.length;i++)
	{
		int j=0;
		for(;j<a.length;j++)
		{
			if(b[i]==a[j])
				break;
		}
		if(j==a.length)
			merge[in++]=b[i];
	}
	int[] res=new int[in];
	for(int i=0;i<in;i++)
	{
		res[i]=merge[i];
	}
	System.out.println(Arrays.toString(res));
	
}
}
