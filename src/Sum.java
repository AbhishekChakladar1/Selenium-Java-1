
public class Sum {

	
	public void Sum1()
	{
		int a=2;
		int b=3;
		int sum=a+b;
		
		System.out.println("Sum of two numberes :" + sum);
				
		}
	
	public void Divide()
	{
		double a=2;
		double b=3;
		double product=(b/a);
	
		
		System.out.println("Division of two numberes :" + product);
				
		}
	public static void Multiply()
	{
		int a=2;
		int b=3;
		int product=a*b;
		
		System.out.println("Multiplication of two numberes :" + product);
				
		}
	


	
	public static void main(String[] args) {
		Sum abhishek=new Sum();
		abhishek.Sum1();
		
		Sum abhishek1=new Sum();
		abhishek.Divide();
		
		
		
		Multiply();
		
	}

}
