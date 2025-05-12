package assignments;

public class Assignment18_String_palindrome {

	public static void main(String[] args) {
		
		//String sentence="A man,a plan, a canal: Panama";
		String sentence="racecars";
		StringBuilder clean=new StringBuilder();
		for(int i=0; i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				clean.append(Character.toLowerCase(ch));
				
			}
			
		} 
		 
		 boolean isPalindrome=true;
		 int len=clean.length();
		 for(int i=0;i< len/2;i++) {
			 if(clean.charAt(i)!=clean.charAt(len-1-i)) {
				 isPalindrome=false;
				 break;
			 }
			 
		 }
		
		if(isPalindrome) {
			System.out.println("The Inut is Palindrome");
		}
		else {
			System.out.println("The Inut is not a Palindrome");
		}
		
		
	}

}
