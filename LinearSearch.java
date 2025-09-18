package com.array;

public class LinearSearch {
	public static void main(String[] args) {
int[] ar= {25,56,78,39,72};
int ele=78,index=-1;
for(int i=0;i<ar.length;i++)
{
	if(ar[i]==ele)
	{
		index=i;
		break;
	}
}
if(index!=-1)
	System.out.println(ele+" Element found at "+index);
else
	System.out.println("Element not found in the list");
	}
}