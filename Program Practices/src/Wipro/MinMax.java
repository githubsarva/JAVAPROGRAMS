package Wipro;

import java.util.Arrays;

public class MinMax {

	
	public static void main(String[] args) {
		
		
		int[] a= {2,3,4,6,7,-1,-2};
		
		Arrays.sort(a);
		System.out.println("Min Value:"+a[0]);
		System.out.println("Max Value:"+a[a.length-1]);
	}
}
