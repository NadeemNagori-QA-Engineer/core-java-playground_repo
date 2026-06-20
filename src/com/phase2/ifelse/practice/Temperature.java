package com.phase2.ifelse.practice;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
/*		Question 1: Temperature Check
		User se temperature input lo aur batao:

		35 se upar → "It's Hot!"
		20 se 35 ke beech → "It's Pleasant!"
		20 se neeche → "It's Cold!"

		Question 2: Voting Eligibility
		User se umar (age) input lo aur batao:

		18 ya usse upar → "You are eligible to vote!"
		18 se neeche → "You are not eligible to vote!"
		Saath me ye bhi batao kitne saal baad eligible honge (agar nahi hain to)
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		float temp = sc.nextFloat();
		if (temp > 35)
		{
			System.out.println("It's Hot!");
		}
		else if(temp > 19)
		{
			System.out.println("It's Pleasant!");
		}
		else 
		{
			System.out.println("it's Cold!");
		}
		
		System.out.println("Enter Your Age Please : ");
		short age = sc.nextShort();
		if (age > 17)
		{
			System.out.println("You are eligible to vote!");
		}else {
			System.out.println("You are not eligible to vote!");
		}
	}

}
