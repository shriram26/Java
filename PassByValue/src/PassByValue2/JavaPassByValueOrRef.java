package PassByValue2;

public class JavaPassByValueOrRef {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.setName("jiffy");
		foo(d);
		//When you pass "d" as object , it not not passing its reference that is address
		//Instead it is creating an alias for itself . That alias is here named as aliasVariable
		//It is initially pointing to null and then pointing to "d"
		//Now inside the foo function , we first print aliasVariable.getname()
		//aliasVariable is now an alias for Object d and point to d. Hence it prints jiffy.
		//Now inside foo function, we create a new object of Dog called "f"
		//By the statement,aliasVariable = f; we mean that aliasVariable which was initially pointing to "d",
		//is now pointing to "f"
		//Now aliasVariable.setName("maxy"); will change and affect the "f" object but not the "d" object and hence prints maxy.
		//Now in main we print d.getname() and it prints jiffy
		
		System.out.println(d.getName());  // jiffy

		// In java, for primitive type - pass by value
		// For complex type - the reference of the object is passed by value(aka pass by reference)
	}

	private static void foo(Dog aliasVariable) {

		System.out.println(aliasVariable.getName());  // jiffy
		Dog f = new Dog ();
		aliasVariable = f;
		aliasVariable.setName("maxy");
		System.out.println(aliasVariable.getName()); // maxy
		

	}
}

class Dog{

	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name){

		this.name = name;
	}
}

