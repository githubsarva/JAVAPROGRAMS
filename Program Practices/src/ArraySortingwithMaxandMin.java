import java.util.Arrays;

public class ArraySortingwithMaxandMin {
	
	public static void main(String[] args) {
		
		int a[]={10,20,30,98,-1,-2,0};
		
		Arrays.sort(a);
		System.out.println("Min Value is:"+a[0]);
		System.out.println("Max Value is:"+a[a.length-1]);
	}

}
