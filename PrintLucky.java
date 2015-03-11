package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLucky {
	
	public static void main(String[] args){
		boolean flag=true;
		long temp, lucky=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter N : ");
			String t1= br.readLine();
			long n= Long.parseLong(t1);
			if(n>0){
				for(long i= n+1;i<1000000;i++){
					temp=i;
					while(temp>0){
						if((temp%10)==3 || (temp%10)==5){
							flag=true;
						}else {
							flag=false;
							break;
						}
						temp=temp/10;
					}
					if(flag){
						lucky=i;
						break;
					}
				}
				System.out.println("Lucky No : "+lucky);
			}else {
				System.out.println("No. out of Range.");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
