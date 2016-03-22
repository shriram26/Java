import java.lang.ref.WeakReference;
import java.util.HashMap;


public class TestMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//e1 and e2 employee objects have the same data
		
		e1.setId(8);
		e2.setId(8);
		e3.setId(18);
		
		e1.setFirstName("Shriram");
		e2.setFirstName("Shriram");
		e3.setFirstName("Avinash");
		
		e1.setLastName("Sridharan");
		e2.setLastName("Sridharan");
		e3.setLastName("Chander");
		
		e1.setDesignation("Engineer");
		e2.setDesignation("Engineer");
		e3.setDesignation("Design Engineer");
		
		HashMap<Employee,Integer> mp = new HashMap<Employee,Integer>();
		mp.put(e1,e1.id);
		mp.put(e2,e2.id);
		mp.put(e3,e3.id);
		
		System.out.println(mp);
		
	}

}

// Listen to this story
// First Story : No HashMap involved
// Two objects are equal. How will you tell using .equals method ?
// Because,.equals method will compare two objects based on reference
// So override equals method and write it in such a way that it compares values


// So why override hashCode() now ?
// Now you know that two objects are equal , so they must return the same hashcode

// Second Story : HashMap involved
// Now let us consider a HashMap
// The key is Employee object and value is Employee ID field inside Employee Object
// Now you have given here e1 and e2 to be same values and e3 is different value
// where e1,e2 and e3 are employee objects
// Now you want to put these key,value pairs in HashMap
// So the HashMap should have only e1 and e3 objects because they are only unique
// Hash Map has unique keys
// Now you know that e1 and e2 have same values and e3 is different. How will the HashMap know that ?
// How will hash map know that e1 and e2 objects are keys that contain the same value?
// So put either e1 or e2 only in HashMap and not both

// So to tell e1 and e2 objects have the same value , override their hashcode()
// Override their hashcode() in such a way that you get the same hash code values for both e1 and e2.
// So what ?

// Now you should know how HashMap functions to appreciate why same value of hashcode
// HashMap consists of Key Value pairs. If u give key , the you will get value.
// So in table you will have index and node pairs.
// See you tube video for it
// So if you get the same hash code, then it means you will the get the same index value.
// Now if you get the same index value, your equals function will be internally called
// by HashMap to see if in that index, any of the nodes present in that index are equal to the 
// entry which you want to put inside HashMap
// If values are equal, then hash map wont put inside hash map
// Thus Key value pairs are unique
// If same hashcode, -> same index value -> call equals method to see values
// if (same values)
// { 
// Dont put in hash Map
// }
// else
// {
// Put in hashmap
// }
// So , even two objects can have same hash code but their values can be different
// But , if you objects are equal, then they should have the same hash value



