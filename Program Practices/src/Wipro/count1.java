package Wipro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count1 {
	
	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		String original = input.nextLine();
		
		HashMap<Character , Integer> hm= new HashMap<Character, Integer>();
		char[] ch=original.toCharArray();
		
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else{
				hm.put(c, 1);
		}
			
		}
		
		for (Map.Entry entry : hm.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
	}

}
}
