package com.bridgelabzbasicpractice;

import java.util.Scanner;

public class PrimeOrNot {
	public static  void main (String[]args)
	  {
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println ("Enter the first number::");

int num1= sc.nextInt();


	  
		  for(int i=1;i<=num1/2;i++) {
			  if(num1%i==0) {
		  
			  count++;
			  }}
			  if(count>1) {
			  System.out.println("This is not a prime number" );
			  }else {
				  System.out.println("This is a prime number" );
			  }
}}