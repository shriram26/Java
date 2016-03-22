
public class StaticandNonStatic {
	private int NotCommonForAllObject1 = 20 ;//non static/instance variable initialization
	private int NotCommmonForAllObject2;//non static /instance  variable declaration
	private static int commonForAllObject = 40;//static variable initialization
	private static int commonForAllObject1;//static variable declaration 
	//static variables are always initialized to 0 by default

	 public static void commonFunctionForAllObjects(){

		//System.out.println(++NotCommonForAllObject1);//non static variable
		//System.out.println(NotCommmonForAllObject2);//non static variable
		//Now variables NotCommonForAllObject1 and NotCommonForAllObject2
		//take different values for each object
		//Static Functions are used if you want to change the value of a variable for all the objects
		//But now NotCommonForAllObject1 and NotCommonForAllObject2 will vary for each object
		//So,instance variables cannot be used inside static functions because they vary for each object

		System.out.println(commonForAllObject);//static variable
		//Inside a static function you can use only static variables and local variables
		//Local variables are those which are defined inside this function
		//Variables which are common for every object ,say 10 objects are put as static variables
		//You can use static variables inside static function  because they are common for every object
		//If the variable "commonForAllObject" changes inside this function using say Object1, then the value in all the Objects say Object 2 to Object 10 gets changed
		//i.e. Object1.commonFunctionForAllObjects() is called and the value is incremented inside this function,then the value in all the Objects say Object 2 to Object 10 gets changed

		//Local Variable declaration and initialization are permitted
		int localVariableInsideStaticMethod1 = 10;//initialization permitted
		int localVariableInsideStaticMethod2;//declaration permitted
		System.out.println(localVariableInsideStaticMethod1);
		//local variables are allowed

		//Static Variable Declaration and Initialization are not permitted inside static function and also a non static function
		//They can be done only inside a class
		//static int staticVariableDeclarationInsideStaticFunction;//Error 
		//static int staticVariableInitiazationInsideFunction = 40;//Error
	}




	public void NotCommonFunctionForAllObjects(){

		System.out.println(++NotCommonForAllObject1);//non static variable/instance variable
		System.out.println(NotCommmonForAllObject2);//non static variable/instance variable
		//Instance variables can be used and its values can be changed inside non static functions
		//But changing value of the variable inside this function,it changes the value for only one particular object
		//Object1.NotCommonFunctionForAllObjects(); means it changes the value of Object1 alone and not for remaining 9 objects


		System.out.println(commonForAllObject++);//static variable
		//A static variable which is initialized or declared inside a class
		//can be modified inside a non-static function
		//When you modify a static variable inside a non-static function or a static function using one object,
		//then the value of that variable changes for every object in that class


		//Static Variable Declaration and Initialization are not permitted inside static function and a non static function
		//They can be done only inside a class
		//static int staticVariableDeclarationInsideNonStaticFunction = 20;//initialization
		//static int staticVariableDeclarationInsideNonStaticFunction;//declaration

		int localVariableInsideNonStaticFunction1 = 90;
		int localVariableInsideNonStaticFunction2;
		//Local variables can be initialized and declared inside non static functions

	}

}
//Points about static

//Class variables are static variables
//Instance variables are those non static variables that are declared/initialized inside a class but not inside methods 

//STATIC METHODS CANNOT BE OVERRIDEN because 
//The point of polymorphism is that you can subclass a class(create a child class for the parent class)and the objects implementing 
//those subclasses will have different behaviors for the same methods defined in the
//superclass (and overridden in the subclasses). A static method is not associated
//with any instance of a class so the concept is not applicable.

//You cannot use static methods inside interface because inside interface you do not
//provide method definitions and every method needs to be overridden in the class
//that implements the interface.
//Static methods cannot be overridden as we saw above

//Scenarios to use static methods
// 1. If you are writing utility functions
// 2. If you are sure that method functionality is not going to change
// 3. You do not have to create an object
// 4. JVM optimizes static methods
// 5. Static methods are shared between objects

// Static 


