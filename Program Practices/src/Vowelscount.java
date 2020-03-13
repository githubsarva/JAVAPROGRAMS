import java.util.Scanner;

public class Vowelscount {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= input.nextLine();
		
		int vcount = 0,ccount=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vcount++;
			}else if((ch>= 'a'&& ch<='z')){
				ccount++;
			}
		}
		System.out.println("Vowvels count:"+vcount);
		System.out.println("Number of consonants:"+ccount);
	}
}
