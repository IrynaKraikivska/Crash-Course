import java.util.Scanner;
 
public class Brick
{   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c,y,x;
        
        System.out.println("Brick size:");
        System.out.print("a: "); a=inp.nextInt();
        System.out.print("b: "); b=inp.nextInt();
        System.out.print("c: "); c=inp.nextInt();
        
        System.out.println("Hole size:");
        System.out.print("x: "); x=inp.nextInt();
        System.out.print("y: "); y=inp.nextInt();
        
        if ((a<=x && b <=y) || (b<=x && a<=y) || (a<=x && c <=y) || (c<=x && a<=y) || (c<=x && b <=y) || (b<=x && c<=y)==true)
           System.out.println("Yes, it fits!");
        else
           System.out.println("No, it's too big!");
        
    }
}