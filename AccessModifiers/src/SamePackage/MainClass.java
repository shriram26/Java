package SamePackage;
import DifferrentPackage.DifferentPackageButSubClass;
import DifferrentPackage.DifferentPackageClass;

public class MainClass {

	public static void main(String[] args) {


		SamePackageButNotChildClass samePkgeNotChild = new SamePackageButNotChildClass();
		SamePackageButChildClass samePackageButChild = new SamePackageButChildClass();
		DifferentPackageClass diffPackage = new DifferentPackageClass ();
		DifferentPackageButSubClass diffPkgeSubClass = new DifferentPackageButSubClass();
		AccessModifierClass accessModifierClass = new AccessModifierClass();


		samePkgeNotChild.printByCreatingAccessModifierClassObjectInsideMethod();
		samePkgeNotChild.printByPassingAccessModifierClassObjectAsParam(accessModifierClass);
		
		samePackageButChild.printByPassingAccessModifierClassObjectAsParam(accessModifierClass);
		samePackageButChild.printByCreatingAccessModifierClassObjectInsideMethod();
		
		diffPkgeSubClass.printByCreatingAccessModifierClassObjectInsideMethod();
		diffPkgeSubClass.printByPassingAccessModifierClassObjectAsParam(accessModifierClass);

		diffPackage.printByCreatingAccessModifierClassObjectInsideMethod();
		diffPackage.printByPassingAccessModifierClassObjectAsParam(accessModifierClass);
		
		accessModifierClass.public_method();

	}

}
