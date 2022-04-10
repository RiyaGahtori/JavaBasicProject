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

		System.out.println(obj.palindromeOrNot(s1));
		obj.reverseOfAString(s1);
		System.out.println(obj.stringEqualOrNot(s1, s2));

	}

}

class QuestionsOnString {

	boolean palindromeOrNot(String s) {
	 
		int n = s.length();
		for( int i =0 ; i<n/2 ;i++)
		{
			if(s.charAt(i) != s.charAt(n-1-i))
			{
				return false;
			}	
		}
		return true;
    
	}

	void reverseOfAString(String s) {
		System.out.println("original String : "+ s);
		int n = s.length();
		String res = "";
		for( int i =n-1 ; i>=0;i--)
		{
		  char a = s.charAt(i);
		  res = res + a;
		  
		}
       System.out.println("reverse String : "+ res);
	}
	
	boolean stringEqualOrNot(String s1,String s2) {
		
		if(s1.length() != s2.length())
			return false ;
		else
		{
			for( int i =0 ; i<s1.length() ;i++)
			{
		       if(s1.charAt(i) != s2.charAt(i))
		    	   return false;
			}
			return true;
		}
		
	}
}