/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demon9trating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");
		
		//Finding data type size using BYTES
		System.out.println("Size of int: " + Integer.BYTES + " bytes.");
		System.out.println("The variable b is int data Type has the value " +b+"\nSize of int:" + Byte.BYTES +" bytes.");
		System.out.println("The variable s is int data Type has the value " +s+"\nSize of int:" + Short.BYTES +" bytes.");
        System.out.println("The variable i is int data Type has the value " +i+"\nSize of int:" + Integer.BYTES +" bytes.");
		
	    System.out.println("The variable l is int data Type has the value " +l+"\nSize of int:" + Long.BYTES +" bytes.");
		System.out.println("The variable f is int data Type has the value " +f+"\nSize of int:" + Float.BYTES +" bytes.");
		System.out.println("The variable d is int data Type has the value " +d+"\nSize of int:" + Double.BYTES +" bytes.");
		System.out.println("The variable c is int data Type has the value " +c+"\nSize of int:" + Character.BYTES +" bytes.");
		
		
		
		//Finding data type size using SIZE
		System.out.println("Size of char: " + Character.SIZE + " bits.");
		System.out.println("Size of double: " + Double.SIZE + " bits.");
		
		//Finding data type range minimum and maximum value
		System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".");
		System.out.println("Maximum value for double range: " + Double.MAX_VALUE + ".");
        
    }
}
