package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String1:");
		String first= input.nextLine();
		System.out.println("Enter the String2:");
		
		
		String second = input.nextLine();
		
		char[] array1= first.toCharArray();
		char[] array2= second.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(String.valueOf(array1).equals(String.valueOf(array2))){
			System.out.println("Given String is anagram");
		}else{
			System.out.println("Not an anagram");
		}
	}
}
