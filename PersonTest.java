public class PersonTest{
	public static void main(String[] args){ //tester file that sets the variables 
		
		//sets variables for person class
		Person p1 = new Person("Daniel", 2006);
		Person p2 = new Person("Ryan", 2008);	
		
		//sets variables for scholar class
		Scholar s1 = new Scholar("Kai", 2019, "Science");
		Scholar s2 = new Scholar("Gabe", 2015, "Spanish");
		
		//sets variables for instructor class
		Instructor i1 = new Instructor("Danny", 2011, 100000);
		Instructor i2 = new Instructor("Logan", 2007, 65000);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
		System.out.println(i2);
		
		
	}
		
	






}
