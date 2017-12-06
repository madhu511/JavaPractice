package com.madhu.java.exercise;
import java.util.Scanner;
public class Exercise6 {
	public static void main(String []args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number:");
		int num1 = in.nextInt();
		System.out.print("Input second number:");
		int num2 = in.nextInt();
		System.out.println("Expected Output:");
		System.out.println(num1 +"+"+num2+"="+num1+num2);
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"X"+num2+"="+(num1*num2));
		try{System.out.println(num1+"/"+num2+"="+(num1/num2));}
		catch(ArithmeticException e){System.out.println("Num2 must not be 0");}
		System.out.println(num1+"%"+num2+"="+(num1 % num2));
		
	}
	
}
