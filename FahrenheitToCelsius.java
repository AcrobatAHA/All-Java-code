import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double celsius,fahrenheit;
		System.out.println("Enter your fahrenheit value ::");
		Scanner sc = new Scanner(System.in);
	    fahrenheit = sc.nextDouble();
	    celsius =(fahrenheit-32)*(5.0/9);
	    System.out.println(fahrenheit+" fahrenheit is "+String.format("%.5f",celsius)+" in celsius.");
	 
	}

}
