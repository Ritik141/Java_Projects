/* Keywords in java can not be used as identifieres in Java
-Object
-Variable name
-Function
-Class
-Etc */
package Unit_01;

public class P2_Task_01_KeywordsInJava {
	public static void main(String[] args)
 	{
	  //method
	   void int()//error invalid method name.
		{
		  System.out.println("We are Here for practical 2 Task 1 : Keywords in Java");
		}
	}

	// variable
	int double=90;// syntax error n token "double" , invalid Variable declarator.

	// Object
	ABC int=new ABC();// Again Error as we are creating object name as int.
}

class ABC {
 ABC()
   {
	   System.out.println("I am class ABC");
   }
}
