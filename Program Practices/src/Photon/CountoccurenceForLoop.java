package Photon;

import java.util.Scanner;

public class CountoccurenceForLoop {

public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String original = input.nextLine();
		char[] c = original.toCharArray();
		int len =c.length;
		System.out.println("len value:"+len);
		
		int i=0,j=0,counter=0;
		for( i=0;i<len;i++){
			counter=0;
			for(j=0;j<len;j++){
				if(c[i]==c[j]){
					counter++;
				}
				
			}
			
			System.out.println("The Character "+c[i]+" is present "+counter+"times");
		}
		
		
	
}
}