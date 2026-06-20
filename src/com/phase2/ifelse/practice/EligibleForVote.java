package com.phase2.ifelse.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate localDate = LocalDate.now();
		System.out.println("Today's Date : "+localDate);
		
		System.out.println("Please Enter Your Date of Birtyh in YYYY-MM-DD Format");
		String birthDateInput = sc.next();
//		System.out.println(birthDateInput);
		
		LocalDate birthDate = LocalDate.parse(birthDateInput);
//		System.out.println(birthDate);
		
		Period age = Period.between(birthDate, localDate);
//		System.out.println("Your Current age is : "+age);
		
		int year  = age.getYears();
		int month = age.getMonths();
		int days = age.getDays();
		
		
		if (year >= 18)
		{
			System.out.println("Your current age is : " + year + " Years.");
			System.out.println("Yout are Eligible for Voting");
		}else {
			LocalDate votingEligibilityDate = birthDate.plusYears(18);
			Period remainingTime = Period.between(localDate, votingEligibilityDate);
			
			System.out.println("Your current age is : " + year + " Years, " + month + " Months, and " + days + " Days.");
		    System.out.println("You are NOT Eligible for Voting right now.");
		    
		 // Yahan exact bacha hua time print hoga
		    System.out.println("You can vote after exactly: " 
		            + remainingTime.getYears() + " Years, " 
		            + remainingTime.getMonths() + " Months, and " 
		            + remainingTime.getDays() + " Days.");

		}
		
		
		int ag = sc.nextInt();
		if (ag >= 18)
		{
			System.out.println("You are eligible to vote!");
		}else {
			System.out.println("You are not eligible to vote!");
			int yearsLeft = (18 - ag);
			System.out.println("You can vote after: " + yearsLeft + " years");
			//System.out.println("You can vote after: \" + (18 - age) + \" years");
		}
				sc.close();
	}

}
