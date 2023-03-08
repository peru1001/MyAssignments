package week1.day2;

import java.util.Arrays;

public class FindIntersection {
	// To find intersection
	public static void main(String[] args) {
	//declaration of array variables	
	int[] a = {3,2,11,4,6,7,8};
	int[] b = {1,2,8,4,9,7};
	//Sorting of declared array
	Arrays.sort(a);
	Arrays.sort(b);
	//first for loop to iterate first array
	for (int i = 0; i < a.length; i++) {
		//second for loop to iterate second array
		for (int j = 0; j < b.length; j++) {
			//comparison of values in both arrays and printing common values
		if(a[i]==b[j])
			System.out.println(a[i]);
		}
	}
	

	}

}
