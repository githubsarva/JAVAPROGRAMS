
public class SwappingNumberWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int x=20;
		int y= 10;
		
		System.out.println("Before Swapping:");
		System.out.println("X VALUE IS:"+x);
		System.out.println("Y VALUE IS:"+y);
x= x+y;
y= x-y;
x=x-y;
		
		System.out.println("After Swapping:");
		System.out.println("X VALUE IS:"+x);
		System.out.println("Y VALUE IS:"+y);
	}

}
