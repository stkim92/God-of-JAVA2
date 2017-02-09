package d.string;

public class StringSample{
	public static void main(String[] args){
		StringSample test = new StringSample();
		//test.constructors();
		System.out.println(test.nullCheck(null));
		test.compareCheck();
	}
	
	public void constructors(){
		try{
			String str = "한글교과서 헤헤";
			byte[] arr1 = str.getBytes();
			printByteArray(arr1);
			
			String str1 = new String(arr1);
			System.out.println(str1);
			
			byte arr2[] =str.getBytes();
			printByteArray(arr2);
			String str2 = new String(arr2, "EUC-KR");
			System.out.println(str2);
			
			byte arr3[] = str.getBytes("UTF-16");
			printByteArray(arr3);
			String str3 = new String(arr3,"UTF-16");
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void printByteArray(byte _array[]){
		for(int i=0; i<_array.length; i++){
			System.out.print(_array[i] + " ");
		}
		System.out.println();
	}
	
	public boolean nullCheck(String text){
		//int textLength = text.length();
		//System.out.println(textLength);
		if(text == null){
			return true;
		} else {
			return false;
		}
	}
	
	public void compareCheck(){
		String text = "하이";
		System.out.println(text.length());
	}
}
