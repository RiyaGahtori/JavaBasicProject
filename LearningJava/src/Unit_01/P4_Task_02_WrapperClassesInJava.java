package Unit_01;


/*
 * The wrapper class in Java provides the mechanism to convert primitive into object and
 * Why?
 * Because we want to use predefined methods of those objects
 * - boolean data types -> Boolean obj; -> obj.toString();
 *  
 */

public class P4_Task_02_WrapperClassesInJava {


	public static void main(String[] args) {
		// Converting int into Integer
		int a = 20;
		
		String s ="" + a + "";
		
		Integer i = Integer.valueOf(a);// converting int into Interger explicitly
		Integer j = a;// autoboxing, now complier will write Interger.value0f(a) internally
		
		System.out.println(a + " " + " " + j);
		
		System.out.println(i.toString());
		
		// a.toString() can not be done to a  is int not object
		
		//Autoboxing: onverting primitives into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting Objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);

	}

}