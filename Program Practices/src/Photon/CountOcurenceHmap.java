package Photon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOcurenceHmap {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		HashMap<Character, Integer> hm= new HashMap<>();
		
		System.out.println("Enter the String:");
		String original=input.nextLine();
		
		char[] c= original.toCharArray();
		
		for(char ch:c){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
				
			}else{
				hm.put(ch,1);
			}
		}
		
		for(Map.Entry entry: hm.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
