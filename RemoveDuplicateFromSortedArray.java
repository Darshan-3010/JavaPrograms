package com.array;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
int[] arr= {1,2,2,3,4,4,5};
int x=0;
for(int i=1;i<arr.length;i++)
{
	if(arr[i]!=arr[x])
		x++;
	arr[x]=arr[i];
}
int[] br=new int[x+1];
for(int i=0;i<br.length;i++)
{
	br[i]=arr[i];
	System.out.print(br[i]+" ");
}
}
}