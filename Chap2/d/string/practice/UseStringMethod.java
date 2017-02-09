package d.string.practice;

public class UseStringMethod{
	public static void main(String[] args){
		UseStringMethod test = new UseStringMethod();
		
		String str = "The String class represents character strings.";
		test.printWords(str);
		test.findString(str, "string");
		test.findAnyCaseString(str, "string");
		test.counterChar(str, 's');
		test.printContainWords(str, "ss");
	}
	
	public void printWords(String _str){
		String splitArr[] = _str.split(" ");
		for( int i=0; i<splitArr.length; i++){
			System.out.println(splitArr[i]);
		}
	}
	
	public void findString(String _str, String _findStr){
		System.out.println(_str.indexOf(_findStr));
	}
	
	public void findAnyCaseString(String _str, String _findStr){
		String newString = _str.toLowerCase();
		System.out.println(newString.indexOf(_findStr));
	}
	
	public void counterChar(String _str, char _c){
		
		char charArr[] = _str.toCharArray();
		int count =0;
		
		for(int i=0; i<charArr.length; i++){
			if(charArr[i] == 's'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void printContainWords(String _str, String _findStr){
		String splitArr[] = _str.split(" ");
		for( int i=0; i<splitArr.length; i++){
			if(splitArr[i].contains(_findStr)){
				System.out.println(splitArr[i]);
			}
		}
	}
}