package Photon;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the First String:");
		String first = input.nextLine();
		System.out.println("Enter the Second String:");
		String second = input.nextLine();
		
		char[] array1=first.toCharArray();
		char[] array2=second.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(String.valueOf(array1).equals(String.valueOf(array2))){
			System.out.println("The String is anagram");
		}else{
			System.out.println("Not an anagram");
		}
	}
}
