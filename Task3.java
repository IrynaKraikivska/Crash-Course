import java.util.Scanner;  
 
public class Task3
{   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r;
		System.out.println("radius: ");
		r=inp.nextDouble();
		double pi=3.1415;
		double p=2*r*pi;
		double a=pi*r*r;
        System.out.println("perimeter: "+p+" area: "+a);
		System.out.println("name: "); 
		String name=inp.next(); 
		System.out.println("Where do you live, "+name+"?");
		Scanner sc= new Scanner(System.in);
		String address=sc.nextLine(); 
		System.out.println("name: "+name);
		System.out.println("address: "+address);
    }
}