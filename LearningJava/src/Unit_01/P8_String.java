package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
	//	obj.reverseOfAString(s1);
		//obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int i = 0 , j = s.length() - 1 , mid , flag = 1;
		if(s.length() % 2 == 0)
			mid = (s.length() /2) - 1;
		else
			mid = s.length() /2;
		while(i <= mid)
		{
		  if(s.charAt(i) != s.charAt(j))
			  flag = 0;
		  i++;
		  j--;
		}
		if(flag == 1)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

	void reverseOfAString(String s) {
		// Write Logic Here!

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		
	}
}