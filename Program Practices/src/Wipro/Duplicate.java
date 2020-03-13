package Wipro;

public class Duplicate {
	
	public static void main(String[] args) {
		String[] names = {"A","A","C","D","E","C"};
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println("Dupliacte Element is:"+names[i]);
				}
			}
		}
	}

}
