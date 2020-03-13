package Wipro;

import java.util.Scanner;

public class SeparateString {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		String original = input.nextLine();
		
		String[] word= original.split(" ");
		String reverseWord="";
		for(int i=0;i<word.length;i++){
			String words = word[i];
			String reverseString = "";
			for(int j=words.length()-1;j>=0;j--){
				reverseString = reverseString + words.charAt(j);
			}
			reverseWord = reverseWord + reverseString + " ";
		}
		System.out.println(reverseWord);
	}

}
