
public class FactorialProgram {
	
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The fact value of 5 is:"+fact);
	}

}
