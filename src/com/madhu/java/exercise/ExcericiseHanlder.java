package com.madhu.java.exercise;

import java.io.IOException;
import java.util.Scanner;

/** 
 * The class is the exercise handler which will execute the classes one by one to find the basic 
 * Behavior of the Java language
 * 
 * @author MJ
 * @version 1.0
 * @category JavaBasicExercise
 */
public class ExcericiseHanlder {
	
	/**
	 * Main method that calls all the programs to display the outputs
	 * @param Select the program to execute by sequence number
	 * @return Executes the output of the program selected
	 */
	public static void main(String []args) throws IOException
	{
		System.out.println("Please select the program to execute:");
		System.out.println("1.Data Types");
		System.out.println("2.Literal Overflow");
		Scanner in = new Scanner(System.in);
		switch (in.nextInt())
				{
		case 1: new DataTypesTest().display();
		case 2: new LiteralOverflow().display();
		}
		in.close();
				 
	}

}
