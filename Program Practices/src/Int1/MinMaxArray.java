package Int1;

public class MinMaxArray {
	
	public static void main(String[] args) {
		
		int a[] = {10,5,-1,-2,03};
		
		int min = a[0];
		int max= a[0];
		
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
				
			}
			
		}
		System.out.println("Max value:"+max);
		System.out.println("Min value:"+min);
	}

}
