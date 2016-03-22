
public class Employee {
	public int id;
	public String firstName;
	public String lastName;
	public String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if((this.id == e.id)&&(this.firstName.equals(e.firstName))&&(this.lastName.equals(e.lastName))&&(this.designation.equals(e.designation)))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + "]";
	}

}

// toString() will in general give the reference of the string i.e. memory address
// == operator is used for comparing two primitive data types i.e. their values are compared
// .equals method is used for comparing two objects i.e. their references are compared

// Now, in the case of String class, .equals method compares the value of two strings
// This is because inside the String class, when we pass two string objects , it in turns
// calls the toString method of the two objects
// In String class, the toString() method is overridden in such a way that instead 
// of returning the reference it returns the value of the object passed to the equals function
// Hence in the String class,the equals function will be returned with the values of the two strings from the toString()
// Thus , in String class, equals method compares the value of two strings and
// returns true if values are equal and returns false if the values are not equal

// Now in the case of Employee Class,if the Employee Objects e1 and e2 are equal,
// you should override their hashCode() methods to return the same hashcode for e1 and e2
// So,to compare two objects of type Employee using .equals method,by default
//.equals method will compare the references of objects e1 and e2 even though their
// values are the same.
// So you should explicitly override the equals method inside the Employee class to compare values





