package Wipro;

import java.util.Scanner;

public class KeepOnlyNumbers {

	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String");
		String original= input.nextLine();
		original= original.replaceAll("[^0-9]","");
		System.out.println("OnlyNumbers:"+original);
	}
}
