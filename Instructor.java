public class Instructor extends Person{
	private double salary;
	public Instructor(String name, int yearBirth, double salary){
		super(name, yearBirth);
		this.salary = salary;
	}
	public String toString(){
		return ("The Instrictors name is: " + super.name + ", year of birth is: " + super.yearBirth + ", salary is: " + salary);
		
	}
	
	
	
	
	
}
