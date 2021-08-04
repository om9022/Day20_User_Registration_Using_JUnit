package com.bridgelabz.blc.programs;

public class UserValidation {
	public static int findMaxValuOfArray(int array[]){
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
