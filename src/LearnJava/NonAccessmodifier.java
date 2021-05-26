package LearnJava;

 public class NonAccessmodifier {

	
	abstract float area();//(in case of abstract class the class name should have the abstract name added to it,In case of abstract class 
	// the class cannot define any object)
	
	//final int i=10;
	public synchronized void nonStatictest() 
	//Synchronized here refers that only one thread can access the method at a time.Thread are nothing but parallel execution
	{
		//i=11;----In case Final access modifier is present we cannot assign any value
		
	System.out.println("Hello World4");
	}

	
	public static void Statictest() {
		System.out.println("Hello World ");
		}
	public static void main(String[] args) {
		
		
System.out.println("Hello World");
NonAccessmodifier abhishekobject=new NonAccessmodifier();//(This error is happening as we have created a abstract class)
abhishekobject.nonStatictest();
Statictest();
	}
}