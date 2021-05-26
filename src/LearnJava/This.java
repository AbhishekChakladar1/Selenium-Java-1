package LearnJava;

public class This {
	


//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.
//
 
//int rollno;  
//String name;  
//float fee;  
public This (){  
//this.rollno=rollno;  
//this.name=name;  
//this.fee=fee; 
	
    int rollno;  
	String name;  
	float fee;
	{System.out.println(rollno+" "+name+" "+fee);}  
}  
//void display(){System.out.println(rollno+" "+name+" "+fee);}  
//}  
  
class TestThis2

{  
public static void main(String args[]){  
This s1=new This(111,"ankit",5000f);  
This s2=new This(112,"sumit",6000f);  
s1.This();  
s2.This();  
}
}


