package WhyAnonymousClass;

public class Dog extends Animal{
	@Override
	public void eat(){
		System.out.println("Dog eats");
	}

}
//Here we are creating a Child Class called Dog just to override the eat()
//Instead of creating a ChildClass explicitly to override the functionality,
//We can go for Anonymous Class