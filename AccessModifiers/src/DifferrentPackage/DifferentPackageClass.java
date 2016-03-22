package DifferrentPackage;

import SamePackage.AccessModifierClass;

public class DifferentPackageClass {
	public void printByPassingAccessModifierClassObjectAsParam(AccessModifierClass j){


		//System.out.println(j.priv);
		//System.out.println(j.prot);
		//System.out.println(j.def);
		//Private ,Protected and Default members are not available from Other Packages
		System.out.println(j.pub);

	}

	public void printByCreatingAccessModifierClassObjectInsideMethod(){

		AccessModifierClass am = new AccessModifierClass();

		//System.out.println(am.priv);
		//System.out.println(am.prot);
		//System.out.println(am.def);
		//Private ,Protected and Default members are not available from Other Packages
		System.out.println(am.pub);
	}

}
