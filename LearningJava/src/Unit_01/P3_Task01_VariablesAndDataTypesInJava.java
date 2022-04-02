/* 
 - Variable in Java is a data container that saves the data values during Java program execution
  Types of Variables : 
  _ In Java , there are three types of variables : 
    - local variables - declared inside the body of a method 
    . Instance Variables- Instance variables are defined without the STATIC keyword.
       - They are defined Outside a method declaration.
       - They are object specific and are known as instance variables.
     
     . Static Variables -
       - static  variables are defined with the STATIC keyword.
       - Static variables are initialized only once , at the start of the program execution.
       - these static variables should be initialized first, before the initialization of any */
package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {
    static int q = 11;
    int p = 10;
	public static void main(String[] args) {
		//valid declarations
		int a , b , c;
		float pi;
		double d;
		char e ;
		
		//valid Initializations
		pi = 3.14f;
		d = 20.22d;
		e = 'v';
		
		a = 10;
		b = 10;
		c = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5; //Integer (Whole number)
		float myFloatNum = 5.99f; //Floating point number
		char myLetter = 'D' ;//Character
		boolean myBool = true; //Boolean
		String myText = "Hello" ; //string
		
		System.out.println(myNum );
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println( myBool);
		System.out.println(myText);
		
		//Java variable Type Conversion & type Casting : Details are in OneNote
		double f ;
		int i = 10;
		f = i ; 
		double g = 10;
		int j ;
		j = (int) g; //Type Casting
		
		System.out.println(f );
		System.out.println(i);
		System.out.println(g);
		System.out.println( j);
		
		byte k = 10 ; // 1 byte
		boolean l = true ; //1 bit = true or false only
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;
		
		System.out.println(k );
		System.out.println(l);
		System.out.println(m);
		System.out.println( n);
		System.out.println( o);
		
		System.out.println(ABC.j); // data + functions/methods
		//ABC.display();
		
		ABC  obj1  = new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
	  
		ABC  obj2  = new ABC();
		System.out.println(obj2.i);
		
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
		ABC.typeConversionAndTypeCasting();
	} 
	
	int r = 10;
	void display()
	{
		int a = 5;
		System.out.println("This is Display Method! : ");
		System.out.println(a);
	}
}

class ABC
 {
   static int j = 10; //class variable /static /variable
   int i = 10; //Instance Variable
   
   static void display()
   {
	   int a = 5;
		System.out.println("This is Display Method! : ");
		System.out.println(a);
	}
   
   static void typeConversionAndTypeCasting()
   {
	   double f ; 
	   int i = 10;
	   f = i;
	   System.out.println(f);
	   
	   double g = 10;//64 slots (8 bytes * 8 bit)
	   int j ; //32
	   j = (int)g; //Type Casting
	   //32 bits = 64 bits(not possible)
	   System.out.println(i);
	   System.out.println(j);
   }
 }