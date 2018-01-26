import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minute,second,hour;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your time (value) in second :: ");
	     second = sc.nextInt();
	     minute = second/60;
	     hour = second/3600;
	     System.out.println("Your time is "+hour+" hour "+minute+" minute");

	}

}
