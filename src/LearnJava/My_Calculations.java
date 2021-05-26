package LearnJava;

public class My_Calculations extends Calculation
{
public void multiplication(int x, int y) {
   int z;
	z = x * y;
   System.out.println("The product of the given numbers:"+z);
}
	
public static void main(String args[]) {
   int a = 20, b = 10;
   My_Calculations demo = new My_Calculations();
  Calculation demo1 = new Calculation();
   demo1.addition(a, b);
   demo.Subtraction(a, b);
   demo.multiplication(a, b);
}
}
