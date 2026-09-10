package com.anonnymous;

import java.lang.reflect.Array;
import java.util.Arrays;

// int[] arr={5,3,1,2,4};


//int [] arr={5,6,4,4,4,3,2,1,4,5,9,8};


interface SortArray{
	int[] arraysorted(int [] arr);
}

public class Example4 {

	public static void main(String[] args) {
    int [] arr= {5,3,1,2,4};
    
    SortArray sr=new SortArray() {
		
		@Override
		public int[] arraysorted(int[] arr) {
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			
			return arr;
		}
	};
	
	System.out.println(Arrays.toString(sr.arraysorted(arr)));
    
		
	}

}
