import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String reverse = "";
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the String:");
		String original = input.nextLine();
		int length= original.length();
		
		for(int i= length-1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("The Reversed String is:"+reverse);
	}

}
