package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//input {1,2,3,4,6,7,8,9,10}
public class FindMissing {

	public static void main(String... args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String input = br.readLine();
			int n =10;
			int[] iar = new int[n+1];
			for(int i=1;i<=n;i++){
				iar[i]=1;
			}
			String[] inarr = input.split(",");
			for(int i=0;i<inarr.length;i++){
				int index = Integer.parseInt(inarr[i]);
				iar[index] =0;
			}
			for(int i=1;i<=n;i++){
				if(iar[i]==1){
					System.out.println("Missing Number is "+i);
				}
			}
		//	System.out.println(input);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
