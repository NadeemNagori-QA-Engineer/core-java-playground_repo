package com.javabasics01;

import java.util.Scanner;

public class UserInputDemo {
/*
 * Java me user input ke liye Scanner class use hoti hai.
 * Scanner Class Kya Hai?
 * Scanner ek built-in Java class hai jo java.util package me hoti hai - 
 * isse hum keyboard se user ka input le sakte hain.
 
 * import java.util.Scanner;  // Scanner class import karni padti hai

	Scanner sc = new Scanner(System.in);  // Scanner object banana
	Scanner ke Important Methods:
	Method								Kaam
	sc.nextInt()						Integer input leta hai
	sc.nextDouble()						Decimal input leta hai
	sc.next()							Single word input leta hai
	sc.nextLine()						Puri line input leta hai
	sc.nextBoolean()					true/false input leta hai
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String input
        System.out.print("Apna naam enter karein: ");
        String name = sc.nextLine();
        
     // Integer input
        System.out.print("Apni umar enter karein: ");
        int age = sc.nextInt();
        
     // Double input
        System.out.print("Apni salary enter karein: ");
        double salary = sc.nextDouble();
        
        // Output
        System.out.println("\n=== Aapki Details ===");
        System.out.println("Naam: " + name);
        System.out.println("Umar: " + age);
        System.out.println("Salary: " + salary);
        
        sc.close(); // Scanner band karna good practice hai
        
	}

}
