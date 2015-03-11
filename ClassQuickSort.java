package com.abhishek.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassQuickSort {
	private int array[];
	private int length;

		public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

		void sort(int[] iarray){
			if(iarray==null || iarray.length==0){
				return;
			}
			this.array=iarray;
			length=iarray.length;
			quicksort(0,length-1);
		}
	
		private void quicksort(int lowerindex, int higherindex){
			int i =lowerindex;
			int j =higherindex;
			
			int pivot=array[lowerindex+(higherindex-lowerindex)/2];
			
			while(i<=j){
				
				while(array[i]<pivot){
					i++;
				}
			
				while(array[j]>pivot){
					j--;
				}
				
				if(i<=j){
					exchangenum(i,j);
					i++;
					j--;
				}
			}
			
			if(lowerindex < j)
				quicksort(lowerindex,j);
			if(i < higherindex)
				quicksort(i, higherindex);
			}
		
		private void exchangenum(int i, int j){
			int temp = array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
		public static void main(String... args){
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter list size : ");
			try{
				String t1= br.readLine();
				int size= Integer.parseInt(t1);
				int[] myarray = new int[size];
				System.out.println("Enter "+size+" elements : ");
				String t2= br.readLine();
				String[] inarray = t2.split(",");
				for(int i=0;i<size;i++){
					myarray[i]=Integer.parseInt(inarray[i]);
				}
				ClassQuickSort obj= new ClassQuickSort();
				obj.sort(myarray);
				for(int j : myarray){
					System.out.print(j+" ");
				
				}
		}catch(IOException ex){
			ex.printStackTrace();}
		}
		}

