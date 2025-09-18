package com.array;

public class FrequencyElements {
public static void main(String[] args) {
	int[] ar= {10,20,10,30,20,10};
	boolean b[]=new boolean[ar.length];
	for(int i=0;i<ar.length;i++)
	{
		if(b[i]==false)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					b[j]=true;
				}
			}
			System.out.println(ar[i]+"-> "+count);
		}
	}
}
}
