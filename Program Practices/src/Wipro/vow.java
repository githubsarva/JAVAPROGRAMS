package Wipro;

import java.util.Scanner;

public class vow {
	
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String is:");
		String original =input.nextLine();
		int vcount=0,ccount=0;
		
		original = original.toLowerCase();
		for(int i=0;i<original.length();i++){
			char ch= original.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u'){
				vcount++;
			}else if((ch>='a' && ch<='z')){
				ccount++;
			}
		}
		
		System.out.println("Vowvel count:"+vcount);
		System.out.println("Cons count:"+ccount);
	}

}
