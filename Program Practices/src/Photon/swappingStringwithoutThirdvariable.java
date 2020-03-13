package Photon;

public class swappingStringwithoutThirdvariable {
	
	public static void main(String[] args) {
		
		String s1= "one";
		String s2= "two";
		System.out.println("Before swapping");
		System.out.println("s1 valus is:"+s1);
		System.out.println("s2 valus is:"+s2);
		
		s1= s1 + "&&" + s2;
		String[] arr=s1.split("&&");
		s1=arr[1];
		s2=arr[0];
		System.out.println("After swapping");
		System.out.println("s1 valus is:"+s1);
		System.out.println("s2 valus is:"+s2);
	}

}
