package SamePackage;

public class AccessModifierClass {

	private int priv = 1;
	protected int prot = 2;
	int def = 3;
	public int pub = 4;

	private void priv_func(){
		System.out.println("Private Method ");
	}
	
	protected void prot_func(){
		System.out.println("Protected Method");
		
	}
	void default_method(){
		System.out.println("Default Method");
	}
	AccessModifierClass am = null;
	//AccessModifierClass am = new AccessModifierClass();
	public void public_method(){
		System.out.println("Public Method");
		am=new AccessModifierClass();
		priv_func();//private functions can be called directly like this inside another function inside a class
		//It cannot be called outside the function like(outside public_method) but inside a class (AccessModifierClass)
		//A class can have data members,member functions and object instantiation statements only.
		//It Cannot have function calls just inside a class(AccessModifierClass),meaning it needs to be inside a method
		//If u create object like in line # 22 , i.e. object of same class inside that class,then u will get Stack Overflow
		//error , as it keeps creating objects in recursion
	}
	
	//Public    : Accessible from every where i.e. same package and different package
	//Default   : Accessible from the same package(within package only) Not accessible outside the package
	//			  It is accessible from non - subclass and sub class within the package.
	//Protected : Accessible from the same package and sub classes of different package
	//            It is accessible from a non-subclass but within the same package
	//            It is accessible from subclass within the same package
	//            It is accessible from subclass outside the package(different package but subclass)
	//            it is not accessible from non - subclass outside the package
	//Private   : Accessible within the class only
	//            Not accessible to sub class within the package also.
	//            Not accessible from void main also.It is available just within the class
	
	//Accessible : There are 2 ways of accessing these variables(private,protected,public,default)
	// 1. Directly access 2. Access Using the object of the class in which they are defined
	//Refer SamePackageButChildClass for example
	
	// 1. Direct Access: Example System.out.println(prot);
	//                           System.out.println(priv);
	//These statements need to be printed inside the classes like SamePackageButChildClass,SamePackageButNotChildClass,
	//DifferentPackageClass,DifferentPackageButSubClass
	
	// 2. Access using object: 
	// Create an object for the class where these variables are defined and then
	// using these objects, refer the variables inside this object.
	
	
	
	

}
