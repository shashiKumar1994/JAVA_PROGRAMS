package practice;

import java.util.Arrays;

public class Array_second_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,6,72,15};
		Arrays.sort(arr);
		Arrays.sort(arr);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-2]);
	}

}
