package Photon;

public class SwappingwithoutThirdVariable {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		System.out.println("Before swapping");
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		

		System.out.println("After swapping");
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		
	}
}
