package com.numbers;

public class Factorial {

	public static void main(String[] args) {
int n=factorial(6);
System.out.println(n);
	}
		public static int factorial(int n) { 
		 int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
			}
}

