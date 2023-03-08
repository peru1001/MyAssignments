package week1.day2;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(nums); //2,2,3,5,5,7,7,9
		for (int i = 0; i < nums.length; i++) {//i=0,0<8;

		for (int j = i+1; j < nums.length; j++) {//j=1,1<8;j=2,2<8;j=3,3<8,j=4,4<8, till all iterated value is 8 inner loop will only be executed then only it will goto outer loop
		if (nums[i]==nums[j]) {//2==2 -true,2==3-false,2==5-false,2==5-false 
			System.out.println("duplicate values are: " + nums[i]);
		}
		}
		}
		
	}

}
