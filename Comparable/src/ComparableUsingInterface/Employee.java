package ComparableUsingInterface;

public class Employee implements Comparable<Employee> {
	public int age;
	public String name;
	
	public Employee(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
    @Override
	public int compareTo(Employee e) {
		if(this.age > e.age)
		{
			return 1;
		}
		else if(this.age < e.age)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}

}
//Comparable interface should be used inside the class in which you want to 
//compare two objects i.e.  Employee Class directly in this case
//I want to compare two Employee objects
//But compareTo() takes only one argument i.e. Employee e2
//Therefore, the first object is the current object accessed using "this" operator
//This was not the case with Comparator interface
//Comparator can be written separately and it takes two arguments i.e. two Employee objects

