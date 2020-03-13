package Int1;

import java.util.Scanner;

public class vowels {
	
	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		String original = input.nextLine();
		int vcount = 0,ccount=0;
		
		original = original.toLowerCase();
		
		for(int i=0;i<original.length();i++){
			char ch = original.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vcount++;
			}else if(ch>='a' && ch<='z'){
				ccount++;
			}
		}
		System.out.println("Vow:"+vcount);
		System.out.println("Con:"+ccount);
	}

}
