package language.basics;

public class ArrayPractice {

	public static void main(String[] args) {
		// direct initialization
		String[] customername= {"Jai","sultan","Rambo"};
		System.out.println(customername.length);
		System.out.println(customername[1]);
		
        // declaration with size
		String[] employename= new String[4];
		employename[0]="Bharath";
		employename[1]="Tamil";
		employename[2]="Laxman";
		employename[3]="VVS";
		employename[0]="sharma"; 
		System.out.println(employename[0]);
		System.out.println(employename.length); 
		
		 // 2D array 
		// i want to Print [2][0] & [1][1]
		String[][] project= new String[3][2];
		project[0][0]="Java";
		project[0][1]="DotNet";
		
		project[1][0]="C++";
		project[1][1]="Python";
		
		project[2][0]="AI";
		project[2][1]="ML";
		
		System.out.println(project.length); 
	//	System.out.println(project[2][2]);  // out of bound error
		
		System.out.println(project[2][0]);
		System.out.println(project[1][1]);

		 // 3D array 
		
	}

}
