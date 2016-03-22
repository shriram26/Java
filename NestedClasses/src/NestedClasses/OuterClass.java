package NestedClasses;
import NestedClasses.OuterClass.InnerClassPublic;



public class OuterClass {

	private int id;	 // non static variable i.e. instance variable. It can't be used in static nested class
	static int nums; // static member variable can be used from all inner class

	private class InnerClassPrivate{//private inner nested class

		public void print(){
			System.out.println("This is private inner class with Id:"+id);
			System.out.println("This is private inner class with num:"+nums);
		}
	}

	public  class InnerClassPublic{//public inner nested class

		public void print(){
			System.out.println("This is public inner class with instance variable Id:"+id);
			System.out.println("This is public inner class with static variable num:"+nums);
		}
	}
	static class InnerClassStatic{// static nested class
		//A class can be static only if it is a nested class

		public void print(){
			System.out.println("This is static inner class with instance variable Id:");//+id); Can't access non static member variable
			System.out.println("This is static inner class with static variable num:"+nums);
		}
	}

	void getInstance()//creating instance for private and public non static nested class
	{

		InnerClassPrivate obj1 = new InnerClassPrivate(); // private inner class instance can be created only inside outer class
		obj1.print();//calling from inside the outer class itself

		InnerClassPublic obj2 = new InnerClassPublic(); // public inner class instance can be created inside outer class and also from main
		obj2.print();//calling from inside the outer class itself
		
		InnerClassStatic staticInner1 = new InnerClassStatic();// static inner class instance can be created inside the outer class 
		//The instance can be created from inside the outer class and also from main()
		staticInner1.print();//calling from inside the outer class itself

	}
	InnerClassPublic obj3 = new InnerClassPublic(); // public inner class instance can be created inside outer class class and also from main
	//obj3.print(); you can only create instance outside the function but inside the class but can't call methods inside the outer class.

	InnerClassPrivate obj4 = new InnerClassPrivate();// private inner class instance can be created inside outer class class and also from main
	//obj4.print();you can only create instance outside the function but inside the class but can't call methods inside the outer class.
	
	InnerClassStatic staticInner2 = new InnerClassStatic();// static inner class instance can be created inside the outer class and also from main
	//staticInner2.print();you can only create instance outside the function but inside the class but can't call methods inside the outer class.
	

	void createLocalClass()
	{
		//this is local variable
		final int localVar = 10;

		//this is to create local class
		class LocalClass{
			public void print(){
				System.out.println("THis is local class with Id:");
				System.out.println("THis is local class with num:"+nums);
				System.out.println("THis is local class with num:"+localVar); // localVar must be final. scope is different. the value might change inside local method.
			}
		}

		LocalClass l = new LocalClass();
		l.print();
	}

}

class Testing
{
	public static void main(String[] args) {

		OuterClass nc = new OuterClass();
		//non static public class instance is created with object of Outer Class
		InnerClassPublic obj5 = nc.new InnerClassPublic();
		obj5.print();//calling from outside the outer class

		//can't create InnerClassPrivate from outside OuterClass, since it is private to it.
		
		

		OuterClass.InnerClassStatic obj6 = new OuterClass.InnerClassStatic();

		//creating instance of static inner class using OuterClass.InnerClassStatic

		//LocalClass l1 = new LocalClass();Error you cannot create object of Local Class in main()
		// because LocalClass scope is within that method
	}	

}


