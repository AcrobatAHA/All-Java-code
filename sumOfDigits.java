/*Write a program to sum of digits of given integer number.*/

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter a digit :: ");
		Scanner ob = new Scanner(System.in);
		int digit = ob.nextInt();
		int temp =digit,sum=0;
		while(digit!=0) {
			
			temp =digit%10;
			digit /=10;
			sum +=temp;
		}
		System.out.println("The sum of the digit is :: "+sum);
		

	}

}
