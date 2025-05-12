package assignments;

public class Assignment16_StringPara {

	public static void main(String[] args) {
		
		String para="Java is a popular programming language. Java is used for web development, mobile application, and more.";
		String oneword="Java"; 
		
		System.out.println(""+oneword);
		
		String[] words= para.split(" ");
		
		int Occurencescount=0;
		
		for(int i=0; i < words.length;i++) {
			
			String clean=words[i].replaceAll("[^a-zA-Z]", "");
			
			if(clean.equals(oneword)) {
				System.out.println("index  "+i);
				Occurencescount++;
			}
			
		} 
		System.out.println("Occurences : "+oneword+" "+Occurencescount);

	}

}
