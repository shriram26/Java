package StringPool;

public class StringPool {

	public static void main(String[] args) {
		//There are 2 ways of creating a string
		// 1. Using String Literal
		// 2. Using String Object

		//In general
		//== operator compares the reference of s1 and reference of s2
		//.equals method operator compares the value of s1 and s2

		//Creating using string literal
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);//returns true 
		System.out.println(s1.equals(s2));//returns true

		//Say ,"abc" is created in memory address 3000
		//Now s1 refers to this memory address 3000
		//Now s2 also refers to the same memory address 3000
		//So the reference of s1 and s2 are the same
		//This is String Pool theory.
		//So it checks if abc is present in string pool.If present it assigns the reference of abc to s2.
		//Else it puts/creates abc into string pool and gives the reference to s2. In this case since abc is already present in String Pool,it does not create.
		//For s2,a new object is not created in memory but instead since "abc" is already
		//present in the String Pool, the reference of "abc" which is address 3000 is given to s2.
		//This saves memory and efficient
		//Therefore, the reference of s1 and s2 are the same.
		//== returns true since the references of s1 and s2 are same.
		//In other words , s1 and s2 are referring the same "abc" in memory
		//.equals also returns true since the values contained or referenced by s1 and s2 are the same.
		//Only one memory is used to store abc and both s1 and s2 are referring to it.


		//Creating using string object
		String s3 = new String("xyz");
		String s4 = new String("xyz");
		System.out.println(s3==s4);//returns false
		System.out.println(s3.equals(s4));//returns true
		
		//When we create String using new operator i.e. via constructor,
		//then 2 new strings/2 new objects are created in memory though they are having the same value xyz
		//Say in memory location 4000 - we have "xyz" and is referenced by s3
		//Say in memory location 5000 - we have "xyx" again and is referenced by s4
		//2 memory locations are used.
		//Now the == operator returns false as the references of s3 and s4 are different
		//Now the .equals returns true because the values referenced by s3 and s4 are the same
		
		String s5 = "pqr";//String Literal
		String s6 = new String ("pqr");//String Object
		System.out.println(s5==s6);//returns false
		System.out.println(s5.equals(s6));//returns true
		
		//Same story
		//Though the values of both the strings are the same,2 separate objects are created in memory.
		
		
		String s7 = new String("love");
		String s8 = "love";
		System.out.println(s7==s8);//returns false
		//Now s7 and s8 have different references.
		//So only string literal uses String Pool

	}

}
