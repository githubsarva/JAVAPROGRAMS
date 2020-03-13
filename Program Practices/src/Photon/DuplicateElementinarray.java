package Photon;

public class DuplicateElementinarray {

	public static void main(String[] args) {
		
		String[] names={"a","b","c","c","a"};
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if((names[j]==names[i])){
					System.out.println("The duplicate element is:"+names[i]);
				}
				
			}
		}
	}
}
