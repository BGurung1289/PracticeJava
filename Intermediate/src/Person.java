
public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return jobTitle;
	}
	
	public Person searchFor(Person[] a, Person p) {
		for(Person m: a) {
			if(m == p) {
				System.out.println("Person is found");
				return m;
			}
			else if(m != p) {
				System.out.println("looking .. ");
			}
		}
		System.out.println("Not Found..");
		return null;
	}
	
}
