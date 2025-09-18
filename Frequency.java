package com.array;

public class Frequency {
public static void main(String[] args) {
	int[] ar= {10,20,10,30,20,10};
	int big=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>big)
			big=ar[i];
	}
	int[] count=new int[big+1];
	for(int i=0;i<ar.length;i++)
	{
		count[ar[i]]++;
	}
	for(int i=0;i<count.length;i++)
	{
		if(count[i]!=0)
		{
			System.out.println(i+"->"+count[i]);
		}
	}
}
}
