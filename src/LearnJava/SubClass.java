package LearnJava;

public class SubClass extends SuperClass {
	
	int num=45;
	public static void inner_Class()
	{
		
System.out.println("This is Sub Class");
	}
	
public  void display_inner()

{
	//SubClass abhishek=new SubClass();
	//inner_Class();//When the Super class and sub class member has the same name we use the Super keyword to call the method and the variable
	super.Outer_Class();
	
	
System.out.println("This is a number " + num);
System.out.println("This is a number "  + super.num);
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		inner_Class();
		SubClass abhishek=new SubClass();
				abhishek.display_inner();
		


}
}