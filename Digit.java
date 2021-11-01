import java.util.Scanner;
 
public class Digit
{   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
		System.out.println("n: ");
		n=inp.nextInt();
		int f=0;
		int sqr=n*n;
		while (sqr > 0) {
            if (sqr % 10 == 3) {
                System.out.println("Digit '3' detected!");
				f++;
                break;
            }
            sqr /= 10;
        }
		if (f==0)
			System.out.println("No digit '3'!");
		String s = Integer.toString(n);
        String result = s.substring(s.length()-1);
        
        for (int i = s.length() - 2; i >= 0; i--){
            result = result.concat(s.substring(i, i+1));
        }
        
        int n2 = Integer.parseInt(result);
		System.out.println("Reverse: " + n2);
		
		s = Integer.toString(n);
        if (s.length() > 1) 
			s = s.substring(s.length() - 1, s.length()) + s.substring (1, s.length()-1) + s.substring(0,1);
		
		int n3 = Integer.parseInt(s);
        System.out.println("First and last digits swapped: " + n3);
		
		s = Integer.toString(n);
		String s4 = "1"+s+"1";
		System.out.println("'1' added: " + s4);
                
    }
}