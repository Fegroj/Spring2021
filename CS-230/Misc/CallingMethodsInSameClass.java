/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	
	//public is the access modifer for the method.  
    //this method can be accessed anywhere, including outside the class. 
	//static means that the method belongs to the class and not the object
	//static implies that the method can be called independent of an object
	//static methods are used to perform operations that are not dependent on an object
	//void simply means that the method does not return a value
	//if the method returns a value, you need to denote the type in the first line
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}