package Wipro;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		String original,reverse = "";
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		
		original =input.nextLine();
		int len= original.length();
		
		for(int i=len-1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reversed String is:"+reverse);
		
		if(original.equals(reverse)){
			System.out.println("Palindrome String");
		}else{
			System.out.println("Not Palindrome String");
		}
	}

}
