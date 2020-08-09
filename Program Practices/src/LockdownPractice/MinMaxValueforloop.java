package LockdownPractice;

public class MinMaxValueforloop {

	public static void main(String[] args) {
		
		int a[] = {1,0,9,6,4,3,2,-9};
		
		int min=a[0];
		int max =a[0];
		
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			
			if(a[i]<min){
				min=a[i];
			}
		}
		
		System.out.println("Min value:"+min);
		System.out.println("Min value:"+max);
	}
}
