package problem1;

public class PersonWithJob{
	
	private double salary;
	private Person person;
	
	PersonWithJob(String n, double s) {
		salary = s;
		this.person = new Person(n);
	}
	
	
	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object aPerson) {
	
		return person.equals(aPerson);
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.person));
	}


}
