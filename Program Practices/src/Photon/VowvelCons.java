package Photon;

import java.util.Scanner;

public class VowvelCons {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the string:");
		int vcount=0,ccount=0;
		String original = input.nextLine();
		original= original.toLowerCase();
		for(int i=0;i<original.length();i++){
			char ch= original.charAt(i);
			if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vcount++;
			}else{
				if((ch>='a' && ch <='z')){
					ccount++;
				}
			}
		}
		System.out.println("The vowvel count is:"+vcount);
		System.out.println("The vowvel count is:"+ccount);
	}

}
