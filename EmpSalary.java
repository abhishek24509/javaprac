package com.abhishek.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EmpSalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> empal = new ArrayList<Employee>();
		for(int i=0;i<10;i++){
			Employee emp = new Employee();
			emp.setId(i);
			int random = new Random().nextInt(1000);
			emp.setSalary(random);
			emp.setName("Abhishek"+i);
			empal.add(emp);
		}
		Collections.sort(empal);
			for(Employee e : empal){
				System.out.print("\n"+e.getName()+" ");
				System.out.print(e.getId()+" ");
				System.out.println(e.getSalary());
			}
			Employee emp = empal.get(8);
			System.out.print("\n"+emp.getName()+" ");
			System.out.print(emp.getId()+" ");
			System.out.println(emp.getSalary());
		
		
	}


}
