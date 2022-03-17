package interview;

public class DuplicateInString {
	public static void main(String args[]) {
		
		String str="mohamaddhono";
		int length=str.length();
		char ch[]=str.toCharArray();
		
		for (int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters are: "+ch[i]);
					break;
				}
			}
		}
				
	}

}
