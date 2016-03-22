package Interface;

public class Class1 implements Interface {
	public int add(int a,int b){
		System.out.println("Added");
		return 0;
	}
	
	public int multiply(int a ,int b,int c)
	{
		System.out.println("Multiplied");
		return 0;
	}
	
	
}
// A class can only be public,abstract and final
// The methods that the class implements from the interface can only be public.
// It cannot reduce the visibility of the interface method by putting protected or private