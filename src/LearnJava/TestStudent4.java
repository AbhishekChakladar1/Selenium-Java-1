package LearnJava;

public class TestStudent4{  
 int rollno;  
	 String name;  
	 void insertRecord(int rolln, String n){  
	  this.rollno=rolln;  
	  this.name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  

	 
		public static  void main(String args[]) {
	  TestStudent4 s1=new TestStudent4 ();
	  TestStudent4 s2=new TestStudent4();  
	  s1.insertRecord(111,"Karan");  
	  s2.insertRecord(222,"Aryan"); 
		
	
System.out.println(s1.rollno + " " + s1.name);
	
	 }  
		}
