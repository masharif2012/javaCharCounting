package allStringMethods;

public class CharCounting {

	public static int charCount(String str) {
		int count =0;
		for (int i=0; i<=str.length(); i++) {
			if(str.charAt(i)=='h') {
			count ++;	
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		
		
	}

}
