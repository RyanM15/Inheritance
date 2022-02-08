public class Person{
	public String name;
	public int yearBirth;
	
	public Person(String name, int yearBirth){ //constructor that sets instance variables 
		this.name = name;
		this.yearBirth = yearBirth;
		
		
	}
	public String toString(){ //converts variables to string so they can print 
		return ("Name: " + name + ", Year of birth is: " + yearBirth); //+ ", year of birth is: " + super.yearBirth + ", major is: " + major);
		
	}





}



