package Int1;

public class DuplicateEle {
	public static void main(String[] args) {
		String[] names={"A","B","B","B","C","D"};
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if((names[i]).equals(names[j])){
					System.out.println("Duplicate Elements is:"+names[i]);
					
					
				}
			}
			
		}
		
		
	}

}
