package language.basics;

public class StringsOperation {

	public static void main(String[] args) {
		
		String value=" Java is the one of the topest Progrming Language, Username: Tamizh : Password:amil@123 ";
		
		System.out.println("Total digits :"+value.length());
		System.out.println("particular character :"+value.charAt(6));
		
		//Reverse
		String reverse="";
		for(int i=value.length()-1;i>=0;i--) {
			reverse =reverse+value.charAt(i);
			
		}
		System.out.println("Reverse:"+reverse); 
		
		//Trim 
		System.out.println("Trim Intially and Last Space :"+value.trim());
		//replace
		System.out.println(" Replace Small a to Captial A :"+value.replace("a", "A"));
		System.out.println(" Remove space :"+value.replace(" ", ""));

		//replaceAll
		System.out.println(" Remove Small Letter Alpabets :"+value.replaceAll("[a-z]", ""));
		System.out.println(" Remove Numbers :"+value.replaceAll("[0-9]", ""));
		System.out.println(" Remove Alpabets&Numbers :"+value.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(" Remove Special Characters :"+value.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Lower and Upper case:
		System.out.println("Upper case for All Letters :"+value.toUpperCase());
		System.out.println("Lower case for All Letters :"+value.toLowerCase());

		//Extract String Static format
		
		System.out.println("extract username :"+value.substring(61, 67));
		System.out.println("extract password with single Substring :"+value.substring(70)); 

		//Extract String Dynamic format
        String[] stringtext=value.split(" ");
        System.out.println(" Dynamically Split with Space :"+stringtext[11]);
        System.out.println(" Dynamically Split with Space :"+stringtext[13]);
        
        // Campare Stings 
        String Myname="Tamizh Selvan";
        System.out.println(" Equal -Exact string match :"+Myname.equals("Tamizh Selvan"));
        System.out.println(" Equal -Partial  string Not match :"+Myname.equals("Tamizh"));
        System.out.println(" Equal -Case Sensitive :"+Myname.contentEquals("tamizh Selvan")); 
        System.out.println(" Contain -:"+Myname.contains("Zh"));
        System.out.println(" Start with - case Sensitive:"+Myname.startsWith("tami"));
        System.out.println(" Start with -:"+Myname.startsWith("Tami"));
        System.out.println(" End with -:"+Myname.endsWith("van")); 
        
        // Join Strings 
        System.out.println("concat the method :"+Myname.concat("Sr"));
        System.out.println("if empty Means True :"+Myname.isEmpty());
        System.out.println("if full on empty space True :"+Myname.isBlank());


        




        


	}

}
