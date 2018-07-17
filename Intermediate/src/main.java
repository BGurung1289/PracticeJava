
public class main {
	
	public static void main(String[] args) {
		Interm im = new Interm();
		System.out.println(im.blackJack(22, 21));
		
		System.out.println(im.uniqSum(1,2,2));
		
		System.out.println(im.tooHot(70, false));
		
		Person p1 = new Person("Ummayar", 21, "QA Consultant");
		Person p2 = new Person("Riri", 21, "QA Consultant");
		Person p3 = new Person("Ester", 21, "QA Consultant");
		Person p4 = new Person("Maran", 21, "QA Consultant");
		Person p5 = new Person("Ernest", 21, "QA Consultant");
		Person p6 = new Person("Bibek", 21, "QA Consultant");
		System.out.println(p1.getName()+ "," + p1.getAge() + "," + p1.getJob());
		
		Person persons[] = new Person[6];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = p3;
		persons[3] = p4;
		persons[4] = p5;
		persons[5] = p6;
		
		for(Person a: persons) {
			System.out.println(a.getName()+ "," + a.getAge() + "," + a.getJob());
		}
		
		Person looking = p1.searchFor(persons, p4);
		System.out.println(looking.getName());
		
	}
	
	
}
