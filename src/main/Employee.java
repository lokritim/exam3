package main;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	
	private double salary;
    private String name ;
    private int age ;
    private Date joiningDate;
 
    
    
    
    public Employee(String name, int age, double salary,Date d) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.joiningDate=d;
    }
 
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	
    @Override
    public int compareTo(Employee em) {
        return this.age - em.age;
    }
 
    // Setters and Getters
 
    @Override
    public String toString() {
        return "Employee : " + name + " - " + age + " - " + salary +" - " + joiningDate +"\n";
    }

	

}
