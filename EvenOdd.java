/*Any integer is input by the user. Write a program to find out whether it is an odd number even
number.*/

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number :: ");
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		if (num%2 == 0)
			System.out.println(num+" is a Even number.");
		else
			System.out.println(num+" is a Odd number.");
	}

}
