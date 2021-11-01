import java.util.Scanner;  
import java.util.Date; 
 
public class Task4{
	public static void main(String[] args) {
        Person a = new Person("Alice", 1934);
		
		a.output();
        a.age();
		
		Person b=new Person();
		b.input();
		b.output();
		Person c = new Person("Bob", 2002);
		c.changeN("Rita");
		c.output();
		}
}
class Person{
	
		private String name;
		private int birthYear;
		public Person()
		{
			name = "-";
			birthYear = 0;
			return;
		}
		public Person(String n, int bY)
		{
			name = n;
			birthYear = bY;
			return;
		}
		public String getN()
		{
			return name;
		}
		public int getBY()
		{
			return birthYear;
		}
		public void age(){
			Date d=new Date();  
			int year=1900+d.getYear();
			int age=year-getBY();
			System.out.println("Age : " +age ); 
			return;
		}
		public void input(){			
			System.out.println("Name : "); 
			Scanner sc= new Scanner(System.in);
			String n=sc.nextLine(); 
			name=n;
			System.out.println("Birth year : "); 
			int bY=sc.nextInt(); 
			birthYear=bY;
			return;
		}
		public void output(){		
			
			System.out.println("Name: " + getN()); 
			System.out.println("Birth year: "+getBY()); 
			return;
		}
		public void changeN(String n){			
			name=n;
			return;
		}
}
