package com.abhishek.prac;

import java.util.Random;

public class SelectRandom {

	public static void main(String[] args) {
		int[] array = new int[100];
		int[] index = new int[10];
		boolean status = true;
		for(int i=0;i<100;i++)
			array[i]=i;
		
		Random randomgen = new Random();
		index[0] = randomgen.nextInt(100);
		System.out.print(array[index[0]]+" ");
	
		for(int i=1;i<10;i++){
			int rindex = randomgen.nextInt(100);
			for(int j=0;j<i;j++){
				if(rindex == index[j])
					status=false;
				
			}
			
			if(status){
				index[i]=rindex;
				System.out.print(array[index[i]]+" ");
			}
			else{
				i--;
				
			}
		}

	}

}
