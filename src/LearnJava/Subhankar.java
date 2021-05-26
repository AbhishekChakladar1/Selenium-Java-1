package LearnJava;

public class Subhankar {
	
//	public static  void main(String args[])
//	{
//		int i = 4;
//		//i+= i++ + i++; // i+=1(i=i+1) i = i + (i++ + i++) i =  4 + 4
//		
//		i+=4;// i = i + 4
//		System.out.println(i);
//	
//	}
//	public static  void main(String args[])
//	{
//		// equals ==
//		// not equals !=
//		// greater than>, greater equal >=
//		// less than< , less than equal <=
//		int a = 10 ;
//		int b = 11;
//		System.out.println(a>=b);
//		
//		if(a==b)
//		{
//			System.out.println("subhankar");
//		}
//		else
//		{
//			System.out.println("Äbhishek");
//		}
//		
//	}
//	public static  void main(String args[])
//	{
//		int a=0;
//	int b=0;
//		if (a>b)
//		{
//			
//			System.out.println("a is greater than b");	
//		}
//		
//		else {
//			System.out.println("B is greater than a");
//			
//		}
//	}
	
//	public static  void main(String args[])
//	{
//	
//		int a = 30;
//		int b= 40;
//
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//	}
	
//	public static  void main(String args[])
//	{
//		int i = 34581;
//		while(i<10)
//		{
//			System.out.println(i++);
//		}
////		int j = 10;
////		do {
////			System.out.println(j++);
////		}
////		while(j<10);
//	}
	
//	public static  void main(String args[])
//	{
//		
//		int i=348;
//		int x=10;
//		int r = 0;
//int i=1;
//	while(i<=10)
//	{
//		r =r + (i%x);//8=4=12 3/10
//		i = i/x;
//		System.out.println(i++);
//	}
//System.out.println(r);
//	}
//	public static  void main(String args[])
//	{
//	//1,1,2,3,5,8,13,21
//	int n = 100;
//	int f = 0;
//	int s = 1;
//	int t = 1;
//
//	System.out.println(f);
//	
//	while(t<n)
//	{
//		System.out.println(t);
//		t = f+s;//1//2/3//5
//		f = s;//1//1//2//3
//		s=t;//1/2//3//5
//	}
//}
	
	public static void main(String args[])
	{
		int n=100;
		int i=0;
		int j=1;
		int f=1;
		
	
		
		while(f<n)
		{
			System.out.println(f);
			f=i+j;//2//3//5//8//13
			j=i;//1//1//2//3//5//8
			i=f;//1//2//3//5//8//13
			System.out.println(f++);;
			}
		}
	}
	

