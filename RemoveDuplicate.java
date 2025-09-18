package com.array;

import java.util.Arrays;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] ar= {1,2,2,3,4,4,6};
	int[] br=new int[ar.length];
	int x=0;
	for(int i=0;i<ar.length;i++)
	{
		int j=0;
		for(;j<x;j++)
		{
			if(ar[i]==br[j])
			break;
		}
		if(j==x)
		{
			br[x]=ar[i];
			x++;
		}
	}
	int[] cr=new int[x];
	for(int i=0;i<x;i++)
	{
		cr[i]=br[i];
		System.out.print(cr[i]+" ");
		
	}
}
}
