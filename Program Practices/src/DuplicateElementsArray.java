
public class DuplicateElementsArray {
	
	public static void main(String[] args) {
		
		String[] names ={"A","B","C","A","D","D"};
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if((names[i]).equals(names[j])){
					System.out.println("Duplicate Elements in array:"+names[i]);
				}
			}
		}
	}

}
