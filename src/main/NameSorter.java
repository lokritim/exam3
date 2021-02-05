package main;

import java.util.Comparator;

public class NameSorter implements Comparator<Employee>  {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().length() - o2.getName().length();
	}

}
