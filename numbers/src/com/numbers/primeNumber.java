package com.numbers;

public class primeNumber {
	
	public static void main(String[] args) {
		int n=5;
		boolean check=isPrime( n);
		if(check)
			System.out.println(n+"prime");
		else
			System.out.println(n+" not prime");
		}
	
	public static boolean isPrime(int n)
	{
		
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
		     	}
			}
			if(count==2)
				return true;
			else
				return false;
	}
	
}
