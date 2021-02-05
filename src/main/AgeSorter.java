package main;

import java.util.Comparator;

public class AgeSorter implements Comparator<Employee> {
	
	public int compare(Employee emp1, Employee emp2) {
        return emp1.getAge() - emp2.getAge();
    }

}
