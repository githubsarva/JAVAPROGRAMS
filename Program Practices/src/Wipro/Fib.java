package Wipro;

public class Fib {
	
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		
		System.out.print("Fibonic Series:"+ first +"," +second);
		
		int maxVal = 100;
		while(first+second<=maxVal){
			int next = first + second;
			System.out.print(","+next);
			first=second;
			second=next;
		}
		
	}

}
