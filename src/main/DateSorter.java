package main;

import java.util.Comparator;

public class DateSorter implements Comparator<Employee>  {
	
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getJoiningDate().before(o2.getJoiningDate())) {
			
			return 1 ;
		}
		else return -1;
	}
}
