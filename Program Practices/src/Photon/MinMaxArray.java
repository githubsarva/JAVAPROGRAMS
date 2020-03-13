package Photon;

import java.util.Arrays;

public class MinMaxArray {
	
	public static void main(String[] args) {
		
		int a[]={1,0,2,-1,6,3,-2};
		Arrays.sort(a);
		System.out.println("min value is:"+a[0]);
		System.out.println("max value is:"+a[a.length-1]);
	}

}
