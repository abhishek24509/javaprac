package com.abhishek.prac;

public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		int result =0;
	
	if(salary==e.getSalary()){
		result= 0;
	}
		else if(salary>e.getSalary()){
			result = 1;		
		}else {
            result= -1;
		}
	return result;
	}



}
