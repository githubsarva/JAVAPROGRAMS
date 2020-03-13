package Int1;


import java.util.Arrays;
import java.util.Scanner;

public class ana {
	
	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		String first= input.nextLine();
		String second =input.nextLine();
		int len1=first.length();
		int len2= second.length();

			char[] array1=first.toCharArray();
			char[] array2=second.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			if(String.valueOf(array1).equals(String.valueOf(array2))){
				System.out.println("Anagram");
			}else{
				System.out.println("Not an anagra");
			}



			}

}
