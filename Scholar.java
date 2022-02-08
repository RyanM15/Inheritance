public class Scholar extends Person{
	private String major;
	public Scholar(String name, int yearBirth, String major){ //constructor to set instance variables
		super(name, yearBirth);
		this.major = major;
	}
	public String toString(){ //converts variables to string so they can print 
		return ("The scholars name is: " + super.name + ", year of birth is: " + super.yearBirth + ", major is: " + major);
		
	}
	
	
	
	
	
}
