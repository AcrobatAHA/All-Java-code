
public class StudentInfo {
	
	int id; //Fields or data members or instance variable
	String name;

	public static void main(String[] args) {
		
		StudentInfo s1=new StudentInfo(); //Creating an object of Student 
		s1.id=6033;
		s1.name ="Anik"; //Accessing memory through reference variable 
		System.out.println("Student id is :"+s1.id);
		System.out.println("Student name is :"+s1.name);
		
	}

}
