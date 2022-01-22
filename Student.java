package week1.day1;

public class Student {
	
	//Create a global variable name and rollNo.
	public String name = "Divya";
	private int rollNo = 678902;
	
	//Create a public method College
	
	public void college()
	{
		//Create a variable name inside the college method
		String collegeName="PANIMALAR";
		System.out.println("My College Name is: " + collegeName);
	}
	
	
	//In Main method, create object for the class
	//Try calling all College method and the global variable

	public static void main(String[] args) 
	{
		Student obj1=new Student();
		System.out.println("My Name is : "+ obj1.name);
		System.out.println("My RollNumber is : "+ obj1.rollNo);
		obj1.college();
		
	}

}
