package assignments;

public class Assignment15_StringSentence {

	public static void main(String[] args) {
		
		String senten="Java programming is fun and challenging"; 
		
		
		// incase start with or end with space means need to Trim then use Split method
		String[] words=senten.split(" ");
		System.out.println("Total Words :"+words.length); 
		
		String reverse="";
		for(int i=senten.length()-1;i>=0;i--) {
			reverse =reverse+senten.charAt(i);
			
		}
		System.out.println("Reverse the Sentence :"+reverse);  
		
		
		
		StringBuilder firstlettercaps=new StringBuilder();	
		for(String capzz:words) {
			firstlettercaps.append(Character.toUpperCase(capzz.charAt(0))).append(capzz.substring(1)).append(" "); 
			
		}
		
		System.out.println("First Letter caps for Each word : " +firstlettercaps.toString().trim());

		
		
	}

}
