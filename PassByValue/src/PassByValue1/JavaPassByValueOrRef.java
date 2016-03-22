package PassByValue1;

public class JavaPassByValueOrRef {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.setName("jiffy");
		foo(d);
		//When you pass "d" as object , it not not passing its reference that is address
		//Instead it is creating an alias for itself . That alias is here named as aliasVariable
		//It is initially pointing to null and then pointing to "d"
		//Now you create a new object "f and you set a name maxy.
		//But it is not reflected back in main because it is pass by value
		//So in main it is not reflected and the name remains as "jiffy"
		
		System.out.println(d.getName());  // jiffy

		// In java, for primitive type - pass by value
		// For complex type - the reference of the object is passed by value(aka pass by reference)
	}

	private static void foo(Dog aliasVariable) {

		System.out.println(aliasVariable.getName());  // jiffy
		Dog f = new Dog ();
		f.setName("maxy");

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

