/**********************************************************************

  Program Title : Demonstrating Type Conversion in Java
  File Name: "TypeConversion.java"

  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025

 **********************************************************************/

public class TypeConversion {
    public static void main(String[] args) {

        // Widening (Implicit Conversion)
        int intVar1 = 100;           // int (4 bytes)
        double doubleVar1 = intVar1 + 2.00; // double (8 bytes)

        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1 + " (Data size: 4 bytes)");
        System.out.println("Result after implicit conversion from int to double: " + doubleVar1 + " (Data size: 8 bytes)");

        // Narrowing (Explicit Conversion / Type Casting)
        double doubleVar2 = 99.99;  // double (8 bytes)
        double intVar2 = doubleVar2 + 1;  // double (8 bytes)
        int intVar3 = (int) doubleVar2 + 1; // int (4 bytes) after casting

        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2 + " (Data size: 8 bytes)");
        System.out.println("Result after calculation without conversion (still double): " + intVar2 + " (Data size: 8 bytes)");
        System.out.println("Result after explicit conversion from double to int: " + intVar3 + " (Data size: 4 bytes)");

        // Conversion between char and int
        char letter = 'A';     // char (2 bytes)
        int asciiValue = letter; // implicit conversion (char to int) → int (4 bytes)

        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter + " (Data size: 2 bytes)");
        System.out.println("ASCII value: " + asciiValue + " (Data size: 4 bytes)");

        int number = 66;  // int (4 bytes)
        char convertedChar = (char) number; // explicit conversion (int to char) → char (2 bytes)

        System.out.println("\nInt to Char Conversion:");
        System.out.println("Integer: " + number + " (Data size: 4 bytes)");
        System.out.println("Converted to char: " + convertedChar + " (Data size: 2 bytes)");
    }
}
