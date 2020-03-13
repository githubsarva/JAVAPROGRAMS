package Wipro;

public class Swapping1 {
	
public static void main(String[] args) {
	
	
	String one= "xyz";
	String two = "uvw";

	System.out.println("Before Swapping");
	System.out.println("one value is:"+one);
	System.out.println("two value is:"+two);
	
	one = one + "&&"  + two;
	String[] arr= one.split("&&");
	one= arr[1];
	two= arr[0];

	System.out.println("After Swapping");
	System.out.println("one value is:"+one);
	System.out.println("two value is:"+two);
}

}
