package language.basics;

public class ClassObjectPractice {
	
	String name="Tamil"; // instance variable able to call via object inside main method
	static int id=12;   // Static no need object

	void dummy() {
		System.out.println("Party");
	} 
	
	// for Method Able to call directly in obj but datatype(string,double) like that and all unable to call directly with object
	// Use print statement Then Call Obj.name;
      
//	public static void main(String[] args) {
//		// class with object
//		double avg=90.9;
//		ClassObjectPractice obj=new ClassObjectPractice();
//		System.out.println("Print the: "+obj.name);
//		System.out.println("Print the: "+id);
//		System.out.println("Print the: "+avg);
//		obj.dummy();

	}

//}
