package com.javabasics01;

import java.util.Scanner;

public class ControlFlowStatement {

	public static void main(String[] args) {
/*
	Topic 6: Control Flow - If-Else Statements
	Control flow ka matlab hai - program kis condition me kya decision lega.
	Types of If Else -->
	
1. Simple If
	if (condition) {
    code agar condition true hai
}

2. If-Else
	if (condition) {
	code agar condition true hai
	}else{
	 condition false hai
	}

3. If-Else-If Ladder (multiple conditions)
if (condition1) {
    // condition1 true
} else if (condition2) {
    // condition2 true
} else {
    // koi bhi condition true nahi
}

4. Nested If (if ke andar if)
if (condition1) {
    if (condition2) {
        // dono conditions true
    }
}
		 */
		
		Scanner sc = new Scanner(System.in);
			
//		1. Simple If-Else : Even or Odd
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is Even Number");
		}else {
			System.out.println(num+" is Odd Number");
		}
		
//		2. If-Else-If Ladder: Grade System
		System.out.println("Enter Your Marks (0-110) : ");
		int marks = sc.nextInt();

		// 1. Pehle galat marks (out of bound) check karein
		if (marks < 0 || marks > 110) {
		    System.out.println("You have Entered Wrong Marks");
		} 
		// 2. Ab range wise check karein (Neeche aate-aate higher limits apne aap check ho jati hain)
		else if (marks >= 100) { 
		    System.out.println("Grade : A+ Outstanding");
		} else if (marks >= 70) {
		    System.out.println("Grade : A Excellent");
		} else if (marks >= 60 ) {
		    System.out.println("Grade : B Good");
		} else if (marks >= 50) {
		    System.out.println("Grade : C Average"); // Average ki spelling correct ki
		} else {
		    System.out.println("Fail");
		}
		
//		 3. Nested If: Login system example
		System.out.println("Enter Your Username");
		String username = sc.next();
		System.out.println("Enter Your Password");
		String pwrd = sc.next();
		
		if (username.equals("admin"))
		{
			if (pwrd.equals("1234")) {
				System.out.println("Login Successful!");
			}else {
				System.out.println("Wrong Password");
			} 
		} else {
				System.out.println("User Not Found!");
			}
		
	}

}
