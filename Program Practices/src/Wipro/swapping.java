package Wipro;

public class swapping {
	
	public static void main(String[] args) {
		
		int x= 10;
		int y= 20;
		
		System.out.println("Before Swapping:");
		System.out.println("X value is:"+x);
		System.out.println("Y value is:"+y);
		
		x= x+y;
		y= x-y;
		x= x-y;
		

		System.out.println("After Swapping:");
		System.out.println("X value is:"+x);
		System.out.println("Y value is:"+y);
		
		
	}

}
