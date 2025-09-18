package com.array;

import java.util.Scanner;

public class SecondLargestArray {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] x=new int[n];
		System.out.println("Enter the "+n+" Element");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		int big=secondBiggest(x);
		System.out.println("Biggest element is "+big);
		int small=secondSmallest(x);
		System.out.println("Smallest element is "+small);
	}

	private static int secondBiggest(int[] x) {
	int big=x[0],sbig=x[1];
	for(int i=1;i<x.length;i++)
	{
		if(x[i]>big) {
			sbig=big;
			big=x[i];
		}
			else if(x[i]>sbig && x[i]!=big) {
				sbig=x[i];
			}
	}
		return sbig;
	}
	private static int secondSmallest(int[] x) {
		int small=x[0],second=x[1];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<small) {
				second=small;
				small=x[i];
			}
				else if(x[i]<small && x[i]!=small) {
					second=x[i];
				}
		}
			return second;
	
	}
	
}
