package ComparatorUsingInterface;

import java.util.Comparator;

import ComparatorUsingAnonymousClass.Employee;

public class MyComparator implements Comparator<Employee>{
	
	//My Comparator Class implements Comparator interface and overrides the compare method
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.age > e2.age)
		{
			return 1;
		}
		else if(e1.age < e2.age)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		
	}

}
