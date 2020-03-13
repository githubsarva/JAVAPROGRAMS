package Photon;

import java.util.Scanner;

public class KeepOnlyNumber {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the string is:");
		String original = input.nextLine();
		original= original.replaceAll("[^a-z]", "");
		System.out.println("Number is:"+original);
	}

}
