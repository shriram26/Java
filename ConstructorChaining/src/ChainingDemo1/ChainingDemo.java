package ChainingDemo1;

public class ChainingDemo {

	//default constructor of the class
	public ChainingDemo(){
		System.out.println("Default constructor");
	}
	public ChainingDemo(String str){
		this();
		System.out.println("Parametrized constructor with single param");
	}
	public ChainingDemo(String str, int num){
		//It will call the constructor with String argument
		this("Hello"); 
		System.out.println("Parametrized constructor with double args");
	}
	public ChainingDemo(int num1, int num2, int num3){
		// It will call the constructor with (String, integer) arguments
		this("Hello", 2);
		System.out.println("Parametrized constructor with three args");
	}
	public static void main(String args[]){
		//Creating an object using Constructor with 3 int arguments
		ChainingDemo obj = new ChainingDemo(5,10,15);
	}
}

// In constructor chaining,you have four constructors
// No argument,one argument,two arguments and three arguments constructor
// Inside three argument constructor, he calls 2 argument constructor using 
// this(req no. of parameters and type) and inside 2 argument constructor he calls
// 1 argument constructor using this(parameter) and so on.
// Thus , if u call a constructor with three arguments, it will call the default first,
// then 1 argument , then 2 argument and then 3 argument constructor


// Constructor arguments can only be final
// private ,protected,public and static are not allowed
// The constructor can be public ,private and protected
// The private constructor is used in Singleton design pattern
// Constructors have not return type


