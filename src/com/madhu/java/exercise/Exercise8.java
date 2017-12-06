package com.madhu.java.exercise;
import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Multiplication Number:");
		int number = in.nextInt();
		for (int i = 0; i<10; i++)
		{
			System.out.println(number+"X"+(i+1)+"="+number*(i+1));
		}
	}
}
