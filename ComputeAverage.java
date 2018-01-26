import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2,num3,average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st value ::");
	     num1 = sc.nextDouble();
	     System.out.println("Enter your 2nd value ::");
	     num2 = sc.nextDouble();
	     System.out.println("Enter your 3rd value ::");
	     num3 = sc.nextDouble();
	     average = (num1+num2+num3)/3;
	     System.out.println("Average of "+num1+" , "+num2+" and "+num3+" is = "+average);
	
	}

}
