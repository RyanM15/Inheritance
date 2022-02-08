public class Instructor extends Person{
	private double salary;
	public Instructor(String name, int yearBirth, double salary){ //constructor that sets instance variables 
		super(name, yearBirth);
		this.salary = salary;
	}
	public String toString(){ //converts variables to string so they can print 
		return ("The Instructors name is: " + super.name + ", year of birth is: " + super.yearBirth + ", salary is: " + salary);
		
	}
	
	
	
	
	
}
