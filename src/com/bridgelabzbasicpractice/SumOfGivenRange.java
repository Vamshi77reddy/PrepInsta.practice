package com.bridgelabzbasicpractice;

import java.util.Scanner;

public class SumOfGivenRange {
	public static void main (String[]args)
	  {
		Scanner sc = new Scanner(System.in);
	      System.out.println ("Enter the range of a ::");
int a=sc.nextInt();
System.out.println ("Enter the range of b");
int b=sc.nextInt();

;

	    int sum = 0;

	    for (int i = a; i <= b; i++)
	        sum = sum + i;
	      System.out.println ("The sum is " + sum);
	  }
}
