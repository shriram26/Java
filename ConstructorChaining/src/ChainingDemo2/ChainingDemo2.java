package ChainingDemo2;

public class ChainingDemo2 {


	public static void main(String[] args) {

		Carnivore car = new Carnivore("Lion");
	}
}
class Animal {    
	private String name;    
	public Animal(String name)   {     
		this.name = name;    
		System.out.println("I am a " + name);
		System.out.println("I'm executed first.");   
		
	} 
}  
class Mammal extends Animal {    
	public Mammal(String name)   {    
		super(name);    
		System.out.println("I'm executed second"); 
	}
}  
class Carnivore extends Mammal{   
	public Carnivore(String name)   {     
		super(name);     
		System.out.println("I'm executed last");   
	}
}

//Note:
//Inside a class, you can have only one public class
//Hence class Animal,class Mammal,class Carnivore are all not public
//Thus class ChainingDemo2 is alone public

//Coming to our constructor chaining concept,
//In this code we have a base class Animal , a child class mammal for Animal 
//and a grand child class Carnivore for Animal
//Now I create an object of Carnivore in main
//Now it calls the constructor of Mammal using super which in turn calls the 
//constructor of Animal and sets the "Lion" sent as a parameter in grand child class
//i.e. Carnivore class in Animal class
//This is constructor chaining


