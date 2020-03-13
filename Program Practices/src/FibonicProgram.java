
public class FibonicProgram {

	public static void main(String[] args) {
		int first=0,second =1;
		int next=1;
		System.out.print(first +" ,"+second);
		
		int maxVal=100;
		while(first+second<=maxVal){
			next = first+ second;
			System.out.print(","+next);
			first=second;
			second = next;
		}
	}
}
