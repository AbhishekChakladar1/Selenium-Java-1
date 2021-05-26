package LearnJava;

// Inherited class
	public class MethodOverriding1 extends MethodOveridding {
	    // This method overrides show() of Parent
	    
	    int i = 10;
	    @Override
	  public void MethodOveridding()
	    {
	    	
	        System.out.println("Child's show");
	    }
	
	  
	// Driver class

	    public static void main(String[] args)
	    {
	        // If a Parent type reference refers
	        // to a Parent object, then Parent's
	        // show is called
	    	MethodOveridding obj1 = new MethodOveridding();
	        obj1.MethodOveridding();
	  
	        // If a Parent type reference refers
	        // to a Child object Child's show()
	        // is called. This is called RUN TIME
	        // POLYMORPHISM.
	        MethodOveridding obj2 = new MethodOverriding1();
	        obj2.MethodOveridding();
	        System.out.println(obj2.i);
	    }
	
}



