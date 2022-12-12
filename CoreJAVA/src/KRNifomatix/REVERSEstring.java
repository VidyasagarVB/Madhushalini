package KRNifomatix;

public class REVERSEstring {

	public static void main(String[] args) {
//		String actual ="Vidyasagar Bandagar";
//		
//		char arr[]=actual.toCharArray();
//		int si=actual.length();
//		
//		for(int i =si-1; i>=0; i--) {
//			System.out.println(arr[i]);
//	
//		}
		
		String palindrom ="ABA";
		String test="";
		char arr[]=palindrom.toCharArray();
		int si=palindrom.length();
		
		for(int i=si-1; i>=0; i--) {
			test+=arr[i];
			
		}
		
		if(palindrom.toString() == test.toString()) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a Palindrom");
		}
		System.out.println(palindrom);
		System.out.println(test);
		
		
	}
}
