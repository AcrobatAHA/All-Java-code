import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double CircleArea,radius;
		Scanner input = new Scanner(System.in); //for taking input from the user 
		System.out.println("Enter the radius :: ");
		radius = input.nextDouble();
		CircleArea = radius*radius*3.1416; // Rules of calculating circle area 
		System.out.println("Area of the circle is = "+String.format("%.2f",CircleArea)); //Format for decimal point 
		
	}

}
