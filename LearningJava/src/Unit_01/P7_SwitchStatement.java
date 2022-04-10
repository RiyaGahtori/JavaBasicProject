package Unit_01;
import java.util.Scanner;
/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		int a ;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements(a );

	}

}
class SwitchStatements {
	void switchStatements(int a ) {
		switch(a)
		{
		case 1: 
			System.out.println("2022");
			break;
		case 2:
			System.out.println("april");
			break;
		case 3:
			System.out.println("Sunday");
			break;
		default :
			System.out.println("invalid choice");
		}
			
	}
}