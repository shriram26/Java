package DifferrentPackage;

import SamePackage.AccessModifierClass;

public class DifferentPackageButSubClass extends AccessModifierClass {
	public void printByPassingAccessModifierClassObjectAsParam(AccessModifierClass j){


		//System.out.println(j.priv);
		//Private variables not accessible from outside the package
		
		//System.out.println(j.prot);//Error
		
		System.out.println(prot);//Correct
		
		//Here,we want access a protected variable "prot" defined in AccessmodifierClass
		//We are in a different package but inside a derived class/sub class whose parent is AccessModifierClass
		//Now if we access "prot" directly,then we do not get an error.
		//Because protected variables should be available and accessible to sub classes of different package also
		//But if we access using an object "am" of AccessModifierClass then we get an error .Why ?
		
		//Answer:
		//Though the protected variable is accessible from this class,
		//the variable "j" which is an object of AccessModifier is not available in this package.
		//It is defined in SamePackage. So we get this error.
		
		//System.out.println(j.def);
		//Default variable not accessible from outside the package
		
		System.out.println(j.pub);

	}

	public void printByCreatingAccessModifierClassObjectInsideMethod(){

		AccessModifierClass am = new AccessModifierClass();

		//System.out.println(am.priv);
		//Private variables not accessible from outside the package
		
		//System.out.println(am.prot);Error
		System.out.println(prot);//Correct
		
		//System.out.println(am.def);
		//Default variable not accessible from outside the package
		
		System.out.println(am.pub);
		
		
	}
	
	
}
