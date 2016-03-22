package SamePackage;

public class SamePackageButNotChildClass {

	public void printByPassingAccessModifierClassObjectAsParam(AccessModifierClass j){


		//System.out.println(j.priv);
		//Private members not accessible outside the class
		
		System.out.println(j.prot);//accessing using object
		
		//System.out.println(prot);Error accessing directly
		//Here you get error accessing directly because this class SamePackageButNotChildClass
		//does not know any thing about the "prot" variable even though its in the same package
		//This class is neither a child class nor implements any interface in that "prot" is defined.
		//So to know the value of "prot" u need an object of AccessModifierClass which is "j" here.
		//So when you use "j" to access "prot" it does not throw error
		
		System.out.println(j.def);
		//System.out.println(def);Error
		
		System.out.println(j.pub);
		//System.out.println(pub);Error

	}

	public void printByCreatingAccessModifierClassObjectInsideMethod(){

		AccessModifierClass am = new AccessModifierClass();

		//System.out.println(am.priv);
		//Private members not accessible outside the class
		
		System.out.println(am.prot);
		//System.out.println(prot);//Error
		
		System.out.println(am.def);
		//System.out.println(def);Error
		
		System.out.println(am.pub);
		//System.out.println(pub);Error
		
		//Access methods using object
		am.default_method();
		am.prot_func();
		am.public_method();
		
		//Access methods directly *****ERROR******
		//prot_func();
		//default_method();
		//public_method();
		
		//Error accessing directly
		//Here you get error accessing directly because this class SamePackageButNotChildClass
		//does not know any thing about these functions even though its in the same package
		//This class is neither a child class nor implements any interface in that these methods are defined.
		//So to know these functions u need an object of AccessModifierClass which is "j" here.
		//So when you use "j" to access these functions it does not throw error
		


	}
	
	



}




