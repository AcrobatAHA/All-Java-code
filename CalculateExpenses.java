/*Write a program to calculate the total expenses. Quantity and price per item are input by the
user and discount of 10% is offered if the expense is more than 5000.3)*/

import java.util.Scanner;

public class CalculateExpenses {

	public static void main(String[] args) {
		
		float price,quantity,totalExp,discount;
		System.out.println("Enter the quantity : ");
		Scanner ob = new Scanner(System.in);
		quantity = ob.nextFloat();
		System.out.println("Enter the price : ");
		price = ob.nextFloat();
		totalExp = quantity*price;
		if (totalExp > 5000.3) {
			
			discount = totalExp*0.1f;
			totalExp -=  discount;
			
		}
		
		System.out.println("Total expense is :: "+totalExp);
		
	}

}
