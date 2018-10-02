
public class Palindrom {

	
	public static boolean isPalindrom(String s){
		
		int l = s.length();
		
		if(l == 0 || l == 1){
			return true;
		}
		
		if(s.charAt(0) != s.charAt(l-1)){
			return false;
		}
		
		if(s.charAt(0) == s.charAt(l-1)){
			return isPalindrom(s.substring(1,l-1));
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String s = "Anna";
		System.out.println(isPalindrom(s.toLowerCase()));
		
	}

}
