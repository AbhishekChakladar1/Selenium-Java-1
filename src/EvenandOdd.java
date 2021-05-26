import java.util.Scanner;

public class EvenandOdd {
	
	public EvenandOdd (int num) {
	     System.out.print("Enter a number: " + num);
	}

    public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
 int num = reader.nextInt();
System.out.print("Enter a number: ");
        
// EvenandOdd number=new EvenandOdd(10);
         
        if(num % 2 == 0)
           System.out.println(num + " is even");
       else
        System.out.println(num + " is odd");
    }
}