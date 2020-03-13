package Photon;

import java.util.Scanner;

public class SeparateString {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the string:");
		String original = input.nextLine();
		
		String[] word= original.split(" ");
		String reverseWord="";
		for(int i=0;i<word.length;i++){
			String Words= word[i];
			String reverseString="";
			
			for(int j=Words.length()-1;j>=0;j--){
				reverseString = reverseString + Words.charAt(j)
;			}
			reverseWord = reverseWord + reverseString + " ";
		}
		
		System.out.println("The reversed Sentence is:"+reverseWord);
		
	}

}
