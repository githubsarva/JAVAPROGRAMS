package Photon;

public class MinMaxValueArrayForLoop {
	
	public static void main(String[] args) {
		int a[]={1,2,3,0,-1,4,-4,6};
		
		int min=a[0];
		int max = a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Min Value is:"+min);
		System.out.println("Max Value is:"+max);
	}

}
