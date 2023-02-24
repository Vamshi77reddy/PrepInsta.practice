package com.bridgelabzbasicpractice;

import java.util.Scanner;

public class PrimeInRange {
	 public static void main (String[]args)
	   {

		 Scanner sc=new Scanner(System.in);
		 System.out.println ("Enter the first number::");

		 int lower= sc.nextInt();
		 System.out.println ("Enter the second number::");

		 int upper= sc.nextInt();

	     for (int i = lower; i <= upper; i++)
	       if (isPrime (i))
	        System.out.println (i);
	   }

	   static boolean isPrime (int n)
	   {
	     int count = 0;

	    
	     // checking the number of divisors b/w 1 and the number n-1
	     for (int i =2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }

	     // if reached here then must be true
	     return true;
	   }
}

