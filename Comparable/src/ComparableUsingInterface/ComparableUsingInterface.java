package ComparableUsingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableUsingInterface {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(89,"Shaggy"));
		list.add(new Employee(45,"Toru"));
		list.add(new Employee(17,"Myugen"));
		list.add(new Employee(93,"Jack"));
		list.add(new Employee(52,"Jill"));
		list.add(new Employee(32,"Jimmy"));
		
		System.out.println("The list before sorting is");
		int size = list.size();
		for (int i= 0;i<size;i++)
		{
			System.out.println(list.get(i).name);
		}
		
		
		System.out.println("The list in the sorted order is");
		
		
		Collections.sort(list);
		for(Employee e : list)
			System.out.println(e.name);
		
	}

}
//Collections.sort(list of integers) i.e if list contains primitive data types
//then Collections.sort already knows how to sort. You need not say
//Now you have list of Employee Objects
//Therefore, you need to explicitly tell how to sort these Employee Objects

//Now, in the case of Comparator, Collections.sort(list,mc); , you need to give
//two arguments 1. List that contains user defined objects i.e. Employee Objects here 
//				2. Object of MyComparator Class where you tell how to compare the Employee Objects

//Now in the case of Comparable,Collections.sort(list); you need to give only one argument
//1.List that contains the user defined object i.e. list of Employee Objects
//So how does the sort function know how to sort these Employee objects?
//You are telling how to compare these Employee objects inside the Employee class itself
//So, Collections.sort() just takes one argument i.e. list alone

//Comparable cannot be written using Anonymous Class
//It can only be written by implementing the interface


