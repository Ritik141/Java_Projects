package Unit_01;

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
     abc4 obj = new abc4();
     abc4 obj1 = new abc4(1);
     
     System.out.println(obj.a);
     System.out.println(obj1.a);
	}

}

class abc4
{
  	int a ;
  	/*
  	 ClassName(Constructor Parameters)
  	   {
  	     All the class and Instance variables can be initialized here!
  	   }
  	 */
  	abc4()
  	{
  		a = 10;
  	}
  	
  	abc4(int a)
  	{
  		this.a = a;
  	}
  	
  	void display()
  	{
  		int b = 10;
  		System.out.println(a);
  		System.out.println(b);
  	}
  	
  	int display2()
  	{
  		System.out.println(a);
  	    //As a was a local variable so we can not access it outside the method
  		return a;
  	}
}
