package Unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandlingInJava {

	public static void main(String[] args)  {
		abc obj = new abc();
	//	obj.basicException();
		//obj.handleException();
		//obj.multipleCatch();
		//obj.inputMismatchException();
		//obj.stackOverFlowError(6);
		//obj.indexOutOfBoundException();
		obj.nullPointerException();
		//obj.useofThrow(17);
		//obj.useOfThrowsandFinally();
		//obj.checkedAndUncheckedException();

	}

}
class abc {
	 //compiler can not catch this exception at compile time
	void basicException() {
		int b=0;
		int a=100/b;
		System.out.println(a);
		
	}
	void handleException() {
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {               //how exception would be handled 
			System.out.println(e.getMessage());
			
		}
		System.out.println("We are done !");
	}
	void multipleCatch() {
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		//child class exception comes before super class 
		catch(ArithmeticException e) {                 
			System.out.println(e.getMessage()+ "hello ");
			
		}
		catch(Exception e) {              // exception is a super class
			System.out.println(e.getMessage());
			
		}
		
		
	}
	void inputMismatchException() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		System.out.println("Number is "+ num);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Its done !");
		
	}
	void stackOverFlowError(int i) {
		//error can not be handled, that's why catch can not work with error
		try {
		while(i>0) {
			i=i+1;
			stackOverFlowError(i);   //stack overflow due to memory full
		}
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	void indexOutOfBoundException() {
		try {
		int arr[]= {1,4,7,9,6};
		System.out.println(arr[10]);   //array out of bound 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Now its fine !");
	}
	
	void nullPointerException() {
		try {
		String s = null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done !");
	}
	void useofThrow(int age) throws Exception {  // throws is used to  tell  that we cannot handled the  exception here
		
		if(age<18) {
			throw new Exception();  //making an object of exception class
		}
		else {
			System.out.println("You are allowed to enter a ");
		}
		
	}
	void useOfThrowsandFinally(){
		  
		//useOfThrow(17); this will give an error, because here compiler will give an error that you have
		// not handle the exception in this function
		try {
			useofThrow(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("hello");       //if any try fails then go to finally
		}
	}
	void checkedAndUncheckedException() throws Exception {
		//unchecked
		int b=0;
		int a=100/b;   //runtimeException
		System.out.println(a);
		
		//checked -: that directly inherit the throwable class
		
		useofThrow(17);
		
		
		
	}
}
