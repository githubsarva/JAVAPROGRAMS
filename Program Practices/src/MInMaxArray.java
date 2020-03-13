
public class MInMaxArray {

	
	public static void main(String[] args) {
		
		int a[] = {10,20,85,01,-1,65,2};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Largest Number in this array:"+max);
		System.out.println("Smalles number in this array:"+min);
	}
}
