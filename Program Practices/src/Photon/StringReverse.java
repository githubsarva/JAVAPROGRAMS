package Photon;

import java.util.Scanner;



public class StringReverse {
	public static void main(String[] args) {
		String reverse="";
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String");
		String original = input.nextLine();
		int len= original.length();
		
		for(int i=len-1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println("The reversed String is:"+reverse);
	}
	
	

}
