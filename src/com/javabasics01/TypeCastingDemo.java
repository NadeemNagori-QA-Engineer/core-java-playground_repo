package com.javabasics01;

public class TypeCastingDemo {
	/*
	 *Topic 5 - Type Casting
	 "So far, we have learned about data types and variables. 
	 
	 Now let's learn about type casting — that is, converting one data type into another."
	 Abhi tak humne seekha hai data types aur variables. Ab seekhte hain Type Casting - matlab ek data type ko dusre data type me convert karna.
	 
	 Type Casting Ke 2 Types Hote Hain:
	 1. Widening Casting (Implicit) - Automatic hota hai
Chhote data type ko bade data type me convert karna - Java khud kar leta hai, kuch likhna nahi padta.
byte → short → int → long → float → double
Example:
int num = 10;
double d = num;  // int automatically double me convert ho gaya

2. Narrowing Casting (Explicit) - Manually karna padta hai
Bade data type ko chhote data type me convert karna - manually () brackets se karna padta hai, kyunki data loss ho sakta hai.
double → float → long → int → short → byte
Example:
double d = 9.78;
int num = (int) d;  // manually cast karna padega, value 9 ho jayegi (decimal cut)
	 */
	public static void main (String []args) {
		
		System.out.println("=== Widening Casting (Automatic) ===");
		int myInt = 9;
		double myDouble = myInt;
		System.out.println("Int value: " + myInt);
        System.out.println("Double value: " + myDouble);
        
        System.out.println("\n=== Narrowing Casting (Manual) ===");
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2;  // manual casting
        System.out.println("Double value: " + myDouble2);
        System.out.println("Int value after casting: " + myInt2);
        
        System.out.println("\n=== Char to Int ===");
        char myChar = 'A';
        int charToInt = myChar;  // char automatically int me convert hota hai (ASCII value)
        System.out.println("Char value: " + myChar);
        System.out.println("ASCII value: " + charToInt);
        
        System.out.println("\n=== Int to Char ===");
        int num = 65;
        char intToChar = (char) num;  // manual casting
        System.out.println("Int value: " + num);
        System.out.println("Char value: " + intToChar);
		
	}

}
