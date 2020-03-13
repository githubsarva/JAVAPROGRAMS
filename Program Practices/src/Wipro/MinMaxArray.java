package Wipro;

public class MinMaxArray {
public static void main(String[] args) {
	
	int a[]={1,6,5,4,3,2,1,-1,-2,-3};

	int min = a[0];
	int max= a[0];
	for(int i=0;i<a.length;i++)
	{
		
		
		if(a[i]>max){
			max= a[i];
		}
		
		if(a[i]<min){
			min=a[i];
		}
		
	}

	System.out.println("Max Value is:"+max);
	System.out.println("Min Value is:"+min);

}
}
