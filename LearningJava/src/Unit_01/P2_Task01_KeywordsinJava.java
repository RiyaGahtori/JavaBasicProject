package Unit_01;

/*
 * - 50 such keywords[reserved words],meanings are defined by the compiler
 * - 48 + 2
 * - 48 use
 * - 2 for future use [goto*, const*]
 * 
 * Future use: goto*,const*
 * 1.2V : assert**
 * 1.4V : strictfp***
 * 5.0V : enum****
 * 
 * - Keywords: can not be used as identifiers in Java
 *  - object
 *  - variable name
 *  - function 
 *  - class 
 *  - etc.
 */

public class P2_Task01_KeywordsinJava {
	public static void main(String[] args) {
		
		//variable name
		int age = 12;
		{
			System.out.print("The age is : ");
			System.out.println(age);
		}
		//int double = 12; --> Syntax error on token "double", invalid VariableDeclaratorId, we can't use Keyword as variable name.
	}
		//function name
		int abc ()
		//int new() --> Cannot Use Keyword as function name
		{
			
			System.out.println();//type-> sysout [ctrl + space]
			return 0;
		}
		
		//object
		ABC c1 = new ABC();  //class name [Given below]
		//ABC int = new ABC(); --> We are not supposed to use Keyword as Object name in java. For e.g. --> Student int = 2;
		
		//class
		class ABC{
			void display() { 
				System.out.println("Another class!");
			}
		}
		}
		/*class int{
		void display() {
			System.out.println("Another class!");
		}
	} --> class name can never be any keyword in java*/



