import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	
	public static void main(String[] args) {
		
		String str1,str2;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the First String:");
		
		str1=input.nextLine();
		System.out.println("Enter the Second String:");
		str2=input.nextLine();
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(String.valueOf(array1).equals(String.valueOf(array2))){
			System.out.println("Anagram");
		}else{
			System.out.println("Not an anagram");
		}
	}

}
