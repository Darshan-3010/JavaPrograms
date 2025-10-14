package com.array;

import java.util.Scanner;

public class ArrayArmstrong {
public static void main(String[] args) {

long armarr[]=new long[20];
int count=0;
for(int i=1;i<=100000 && count<armarr.length;i++)
{
	if(isArmstrong(i))
	{
		armarr[count]=i;
		count++;
	}
}
//	ArraySplit.printArray(armarr);
		
}
static boolean isArmstrong(int x)
{
	int ct=countDigtis(x);
	int sum=0,t=x;
	do {
		int d=x%10;
		sum=sum+getPow(d,ct);
		x=x/10;
	}while(x!=0);
	return t==sum ? true :false;
	
}
private static int getPow(int n, int p) {
	int product=1;
	while(p>0)
	{
		product=product*n;
		p--;
	}
	return 0;
}
private static int countDigtis(int n) {
	int count=0;
	do {
		count++;
		n=n/10;
	}while(n!=0);
	return count;
}

}
