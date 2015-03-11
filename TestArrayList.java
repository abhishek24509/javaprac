package com.abhishek.prac;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(79);
		A.add(8);
		A.add(10);
		A.add(11);
		A.add(12);
		A.add(14);
		A.add(15);
		A.add(20);
		B.add(3);
		B.add(7);
		B.add(8);
		B.add(20);
		int size=A.size();
		for(int ele : B){
			if(ele<size){
				A.set(ele,0);
			}else {
				System.out.println("Index out of Range for "+ele);
			}
		}
	
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i:A){
			temp.add(i);
		}
		System.out.println(temp);
		for(int i : temp){
			if(i==0){
				A.remove(A.indexOf(i));
			}
		
		}
		for(int i:A){
			System.out.print(i+" ");
		}

	}

}
