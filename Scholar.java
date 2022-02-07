public class Scholar extends Person{
	private String major;
	public Scholar(String name, int yearBirth, String major){
		super(name, yearBirth);
		this.major = major;
	}
	public String toString(){
		return ("The scholars name is: " + super.name + ", year of birth is: " + super.yearBirth + ", major is: " + major);
		
	}
	
	
	
	
	
}
