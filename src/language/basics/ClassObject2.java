package language.basics;

public class ClassObject2 {

	public static void main(String[] args) {
		ClassObjectPractice obj=new ClassObjectPractice();
		System.out.println("Print the: "+obj.name);
		obj.dummy();
		// use Class name to call the Static values
		System.out.println("Print the: "+ClassObjectPractice.id);

	}

}
