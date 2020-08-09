package LockdownPractice;

import java.util.Arrays;

public class MinMaxArr {
	
	public static void main(String[] args) {
		 int a[] = {1,0,9,6,4,3,2,-9};
		 Arrays.sort(a);
		 
		 System.out.println("min value:"+a[0]);
		 System.out.println("max value:"+a[a.length-1]);
	}

}
