import java.util.Scanner;



public class SeparateStringReverse {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		String original=input.nextLine();
		String[] word=original.split(" ");
		String reverseString="";
		for(int i=0;i<word.length;i++){
			String words = word[i];
			String reverseWord = "";
			
			for(int j=words.length()-1;j>=0;j--){
				reverseWord = reverseWord + words.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
}
System.out.println(" The reversed String is:"+reverseString);
		
		
	}

}
