package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstOcc {

	public static void main(String[] args) {
		boolean flag=true;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String :");
		try{
			String input= br.readLine();
			char[] array= input.toCharArray();
			for(int i =0;i<array.length;i++){
				for(int j=0;j<array.length;j++){
					if(array[i]==array[j] && i!=j){
						flag=false;
						break;
					}else {
						flag = true;
					}
					
						
				}
				if(flag){
					System.out.println(array[i]);
					break;
				}
			}
		}catch(IOException exc){
			exc.printStackTrace();
		}
	}

}
