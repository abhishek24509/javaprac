package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String :");
		try{
			String input= br.readLine();
			char[] array= input.toCharArray();
			for(int i =0;i<array.length;i++){
				if(input.indexOf(array[i])==input.lastIndexOf(array[i])){
					System.out.println(array[i]);
				}
			}
		}catch(IOException exc){
			exc.printStackTrace();
		}
	}

}
