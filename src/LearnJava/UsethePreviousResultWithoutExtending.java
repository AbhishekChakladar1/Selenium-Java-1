package LearnJava;

public class UsethePreviousResultWithoutExtending extends UsetheResultofPreviousMethod   {
	//int x;
	//int y;
	
	  public void multiplication(int a, int b) {
		  
		   z = a * b;
	      System.out.println("The product of the given numbers:"+ z);
	   
	   }
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int c =10;
		   int f=15;
		  

	
	UsethePreviousResultWithoutExtending abhishek1=new UsethePreviousResultWithoutExtending();

	//abhishek1.multiplication(abhishek1.c,abhishek1.f);
	abhishek1.Sum();
	abhishek1.Multiply();
	abhishek1.multiplication(c,f);
	
		

	}

}
