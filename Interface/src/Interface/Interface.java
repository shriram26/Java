package Interface;

public interface Interface {
	public int add(int a,int b);//public method
	abstract int multiply(int a,int b,int c);//abstract method
	public int a = 10;//static and final by default
	

}


//The methods in the interface, can only be public or abstract
//The variables in the interface are static and final by default
//The interface is itself public by default
//All other combinations are wrong
//Methods should not have implementations

//Variables should be static because
//Interface variables are static because Java interfaces cannot be instantiated 
//in their own right and the value of the variable must be assigned in a static context 
//in which no instance exists.

//Variables should be final because
//The final modifier ensures the value assigned to the interface variable is a 
//true constant that cannot be re-assigned by program code.

