package WhyAnonymousClass;

public class TestAnimal {

	public static void main(String[] args) {
		Animal parentClass = new Animal();
		Dog childClass = new Dog();
		
		parentClass.eat();
		childClass.eat();

	}

}
