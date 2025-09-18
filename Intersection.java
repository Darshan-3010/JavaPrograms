package com.array;

import java.util.Arrays;

public class Intersection {
public static void main(String[] args) {
	int[] a= {1,2,3,4};
	int[] b= {3,4,5,6};
	int[] res=intersection(a,b);
	System.out.println(Arrays.toString(res));
}

private static int[] intersection(int[] a, int[] b) {
	int[] rs=new int[a.length];
	int in=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				rs[in]=a[i];
				in++;
				break;
			}
		}
	}
	int[] c=new int[in];
	for(int i=0;i<c.length;i++)
	{
		c[i]=rs[i];
	}
	return c;
}
}
