package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyBinarySearch {

	public int BinarySearch(int[] array, int key){
		int start=0;
		int end= array.length-1;
		
		while(start<=end){
			int mid= (start+end)/2;
			if(key==array[mid]){
				return mid;
			}else if(key<array[mid]){
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String... args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int array[]={2,10,6,1,9,14,15,3,7,8};
		try{
			System.out.println("Enter Key : ");
			String t1= br.readLine();
			int key= Integer.parseInt(t1);
			Arrays.sort(array);
			MyBinarySearch obj=new MyBinarySearch();
			int i=obj.BinarySearch(array, key);
			if(i==-1){
				System.out.println("Not Found");
			}else{
				System.out.println("Index : "+i);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
