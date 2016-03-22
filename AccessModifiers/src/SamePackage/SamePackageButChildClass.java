package SamePackage;

public class SamePackageButChildClass extends AccessModifierClass  {
	
	public void printByPassingAccessModifierClassObjectAsParam(AccessModifierClass j){
		

		//System.out.println(j.priv);
		//Private variable not accessible outside the class
		
		System.out.println(j.prot);
		System.out.println(j.def);
		System.out.println(j.pub);
		
	}
	
	public void printByCreatingAccessModifierClassObjectInsideMethod(){
		
		AccessModifierClass am = new AccessModifierClass();//object creation is default.
		
		//System.out.println(am.priv);//access using object
		//System.out.println(priv)//access directly
		//Private variable not accessible outside the class
		
		System.out.println(am.prot);//access using object
		System.out.println(prot);//access directly
		System.out.println(am.def);//access using object
		System.out.println(def);//access directly
		System.out.println(am.pub);//access using object
		System.out.println(pub);//access directly
		
		//Access functions using object
		am.prot_func();
		am.default_method();
		am.public_method();
		
		//Access functions directly
		prot_func();
		default_method();
		public_method();
		
		
	}
	
	
	
	

}
