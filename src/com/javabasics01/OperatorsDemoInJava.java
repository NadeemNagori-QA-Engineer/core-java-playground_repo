package com.javabasics01;

public class OperatorsDemoInJava {

	public static void main(String[] args) {
/*
  Operators ka use variables par operations perform karne ke liye hota hai.
  Operators 5 types ke hote hain:
1. Arithmetic Operators (Math operations)
Operator			Kaam			Example

+					Addition		10 + 5 = 15
-					Subtraction		10 - 5 = 10
*					Multiplication	10 * 5 = 50
/					Division		10 / 5 = 2
%					Modulus			10 % 3 = 1

2. Relational/Comparison Operators (Comparison karta hai, result boolean hota hai)

Operator			Kaam						Example

==					Equal to					10 == 10 → true
!=					Not equal to				10 != 5 → true
>					Greater than				10 > 5 → true
<					Less than					10 < 5 → false
>=					Greater than or equal		10 >= 10 → true
<=					Less than or equal			5 <= 10 → true

3. Logical Operators (Conditions combine karne ke liye)

Operator			Kaam						Example
&&					AND (dono true ho)			true && false → false
AND					OR (ek true ho)				true || false → true
!					NOT (ulta kar deta hai)		!true → false

4. Assignment Operators
Operator			Matlab						Example
=					Assign karna				int a = 10
+=					Add karke assigna 			+= 5 (a = a + 5)
-=					Subtract karke assigna 		-= 5 (a = a - 5)
*=					Multiply karke assigna 		*= 5 (a = a * 5)

5. Increment/Decrement Operators
Operator			Matlab						Example
++					1 badhao					a++ (a = a + 1)
--					1 ghatao					a-- (a = a - 1)

 */
		// 1. Arithmetic Operators
        int a = 20;
        int b = 7;
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
     // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        
     // 3. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
     // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);

        // 5. Increment/Decrement
        System.out.println("\n=== Increment/Decrement ===");
        int d = 5;
        System.out.println("d++: " + d++);
        System.out.println("After d++, d = " + d);
        System.out.println("++d: " + (++d));

	}

}
