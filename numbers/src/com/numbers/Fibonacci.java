package com.numbers;

public class Fibonacci {

	public static void main(String args[])  
	{    
	 int n1=0,n2=1,temp=0,n=10;    
//	 System.out.print(n1+" "+n2);//printing 0 and 1    
//	    
//	 for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
//	 {    
//	  n3=n1+n2;    
//	  System.out.print(" "+n3);    
//	  n1=n2;    
//	  n2=n3;    
	 if(n==0)
	 {
		 System.out.println(n1);
	 }
	 else if(n==1)
	 {
		System.out.println(n1+" "+n2); 
	 }
	 else {
			System.out.print(n1+" "+n2+" "); 
			for(int i=3;i<n;i++) {
				 temp=n1+n2;
				n1=n2;
				n2=temp;
				System.out.print(temp+" ");
	
			}
//			System.out.println(temp);
 
	 }
	 }    
	  
	}