package com.madhu.java.exercise;
/** 
 * The class will give the DataType illustrations in Java
 * 
 * @author MJ
 * @version 1.0
 * @title DataType illustrations
 * Java has eight primitive types of data: byte, short, int, long, char, float, double, and boolean.
 * These can be put in four groups:
 * Integers includes byte, short, int, and long
 * Floating-point numbers includes float and double
 * Characters includes char, like letters and numbers.
 * Boolean includes boolean representing true/false values.
 * byte
 *  The smallest integer type
 *  a range from -128 to 127. 
 *  useful when working with a stream of data from a network or file. 
 *  Byte variables are declared by use of the byte keyword. 
 *  byte b, c;
 *  
 *  int
 *  
 *  The most commonly used integer type
 *  a signed 32-bit type 
 *  Ranging from -2,147,483,648 to 2,147,483,647
 *  used to control loops and to index arrays. 
 *  the most efficient type
 *
 *  long
 * 
 *  a signed 64-bit type
 *  Type          Explanation
 *
 *  int           A 32-bit (4-byte) integer value
 *
 *  short         A 16-bit (2-byte) integer value
 *
 *  long          A 64-bit (8-byte) integer value
 *
 *  byte          An 8-bit (1-byte) integer value
 *
 *  float         A 32-bit (4-byte) floating-point value
 *
 *  double        A 64-bit (8-byte) floating-point value
 *
 *  char          A 16-bit character using the Unicode encoding scheme
 *
 *  boolean       A true or false value
 *  Type	Default Value
 *  boolean	false
 *  byte	0
 *  short	0
 *  int	    0
 *  long	0L
 *  char	\u0000
 *  float	0.0f
 *  double	0.0d
 *  object reference	null
 *  
 *  Literals
 *  char c = 0xffff; // max char hex value
 *  byte b = 0x7f; // max byte hex value
 *  short s = 0x7fff; // max short hex value
 *  int i1 = 0x2f; // Hexadecimal (lowercase)
 *  int i2 = 0X2F; // Hexadecimal (uppercase)
 *  int i3 = 0177; // Octal (leading zero)
 *  Hex and Oct also work with long.
 *  long n1 = 200L; // long suffix
 *  long n2 = 200l; // long suffix (but can be confusing)
 *  long n3 = 200;
 *  
 *  // ! long l6(200); // not allowed
 *  float f1 = 1;
 *  float f2 = 1F; // float suffix
 *  float f3 = 1f; // float suffix
 *  float f4 = 1e-45f; // 10 to the power
 *  float f5 = 1e+9f; // float suffix
 *  double d1 = 1d; // double suffix
 *  double d2 = 1D; // double suffix
 *  double d3 = 47e47d; // 10 to the power
 *  
 *  Wrapper classes for the primitive types
 */
public class DataTypesTest {
	 static boolean bool;
	  static byte by;
	  static char ch;
	  static double d;
	  static float f;
	  static int i;
	  static long l;
	  static short sh;
	  static String str;
	  /**
	   * displays all the Data Type properties
	   */
	public void display( )
	{
		//program to show the data types in Java
		System.out.println("Integer - ");
		System.out.println("Minimum in Int:"+Integer.MIN_VALUE);
		System.out.println("Maximum in Int:"+Integer.MAX_VALUE);
		System.out.println("Bytes:"+Integer.BYTES);
		System.out.println("Size:"+Integer.SIZE);
		System.out.println("Type:"+Integer.TYPE);
		System.out.println("Default Value"+i);
		System.out.println("Float - ");
		System.out.println("Minimum in Float:"+Float.MIN_VALUE);
		System.out.println("Maximum in Float:"+Float.MAX_VALUE);
		System.out.println("Bytes in Float:"+Float.BYTES);
		System.out.println("MaxExponent in Float:"+Float.MAX_EXPONENT);
		System.out.println("MinExponent in Float:"+Float.MIN_EXPONENT);
		System.out.println("MinNormal in Float:"+Float.MIN_NORMAL);
		System.out.println("NaN in Float:"+Float.NaN);
		System.out.println("Negative Infinity in Float:"+Float.NEGATIVE_INFINITY);
		System.out.println("Positive Infinity in Float:"+Float.POSITIVE_INFINITY);
		System.out.println("SIZE in Float:"+Float.SIZE);
		System.out.println("TYPE in Float:"+Float.TYPE);
		System.out.println("Default Value of Float"+f);
		System.out.println("Double - ");
		System.out.println("Minimum in Double:"+Double.MIN_VALUE);
		System.out.println("Maximum in Double:"+Double.MAX_VALUE);
		System.out.println("Bytes in Doube:"+Double.BYTES);
		System.out.println("MaxExponent in Double:"+Double.MAX_EXPONENT);
		System.out.println("MinExponent in Double:"+Double.MIN_EXPONENT);
		System.out.println("MinNormal in Double:"+Double.MIN_NORMAL);
		System.out.println("NaN in Double:"+Double.NaN);
		System.out.println("Negative Infinity in Double:"+Double.NEGATIVE_INFINITY);
		System.out.println("Positive Infinity in Double:"+Double.POSITIVE_INFINITY);
		System.out.println("SIZE in Double:"+Double.SIZE);
		System.out.println("TYPE in Double:"+Double.TYPE);
		System.out.println("Default Value of Double"+d);
		System.out.println("Long - ");
		System.out.println("Minimum in Long:"+Long.MIN_VALUE);
		System.out.println("Maximum in Long:"+Long.MAX_VALUE);
		System.out.println("Bytes in Long:"+Long.BYTES);
		System.out.println("SIZE in Long:"+Long.SIZE);
		System.out.println("TYPE in Long:"+Long.TYPE);
		System.out.println("Default Value of Long:"+l);
		System.out.println("Character - ");
		System.out.println("Minimum in Character:"+Character.MIN_VALUE);
		System.out.println("Maximum in Character:"+Character.MAX_VALUE);
		System.out.println("Bytes in Character:"+Character.BYTES);
		System.out.println("SIZE in Character:"+Character.SIZE);
		System.out.println("TYPE in Character:"+Character.TYPE);
		System.out.println("Default Value of Char:"+ch);
		System.out.println("There are numerous other punctuations, Unicode, etc..");
		System.out.println("String - ");
		System.out.println("Minimum in String:"+String.CASE_INSENSITIVE_ORDER);
		System.out.println("Default Value of String:"+str);
		System.out.println("Short - ");
		System.out.println("Minimum in Short:"+Short.MIN_VALUE);
		System.out.println("Maximum in short:"+Short.MAX_VALUE);
		System.out.println("Bytes in Short:"+Short.BYTES);
		System.out.println("SIZE in Short:"+Short.SIZE);
		System.out.println("TYPE in Short:"+Short.TYPE);
		System.out.println("Default Value of Short:"+sh);
		System.out.println("Boolean - ");
		System.out.println("Minimum in Boolean:"+Boolean.FALSE);
		System.out.println("Maximum in Boolean:"+Boolean.TRUE);
		System.out.println("TYPE in Boolean:"+Boolean.TYPE);
		System.out.println("Default Value of Boolean:"+bool);
		System.out.println("Byte - ");
		System.out.println("Minimum in Byte:"+Byte.MIN_VALUE);
		System.out.println("Maximum in Byte:"+Byte.MAX_VALUE);
		System.out.println("Bytes in Byte:"+Byte.BYTES);
		System.out.println("SIZE in Byte:"+Byte.SIZE);
		System.out.println("TYPE in Byte:"+Byte.TYPE);
		System.out.println("Default Value of Byte:"+by);

		

		
	}
}
