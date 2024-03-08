package com.numbers;

public class CountDigisInaNum {
	public static void main(String[] args) {
		
	
int n=5419;
int count=0;
int temp=n;
while(n!=0)
{
	count++;
	n=n/10;
	
}
System.out.println(temp+" has "+count+" digits ");
}
}
