package assignments;

public class Assignment2_Array {

	public static void main(String[] args) {
		// 3D array 
		// overall five semester(5) 
		// subject and marks is (2)  Zero is subject and One is Mark
		// values for six columns (6)
		
		String[][][] students_result=new String[5][2][6];
		students_result[0][0][0]="Mathematics I";
		students_result[0][0][1]="Physics";
		students_result[0][0][2]="Chemistry";
		students_result[0][0][3]="Computer Programming";
		students_result[0][0][4]="Engineering Drawing";
		students_result[0][0][5]="Basic Electrical Eng.";
		
		students_result[0][1][0]="Pass(78)";
		students_result[0][1][1]="Pass(85)";
		students_result[0][1][2]="Fail(21)";
		students_result[0][1][3]="Pass(74)";
		students_result[0][1][4]="Pass(88)";
		students_result[0][1][5]="Pass(79)"; 
		
		students_result[1][0][0]="Mathematics II";
		students_result[1][0][1]="Mechanics";
		students_result[1][0][2]="Environmental Sci.";
		students_result[1][0][3]="Basic Electronics";
		students_result[1][0][4]="Engineering Physics";
		students_result[1][0][5]="Engineering Graphics";

		students_result[1][1][0]="Pass(82)";
		students_result[1][1][1]="Pass(77)";
		students_result[1][1][2]="Pass(93)";
		students_result[1][1][3]="Fail(19)";
		students_result[1][1][4]="Fail(24)";
		students_result[1][1][5]="Pass(90)";

		
		students_result[2][0][0]="Data Structures";
		students_result[2][0][1]="Discrete Mathematics";
		students_result[2][0][2]="Digital Electronics";
		students_result[2][0][3]="Operating Systems";
		students_result[2][0][4]="Signals and Systems";
		students_result[2][0][5]="Object-Oriented Prog.";

		students_result[2][1][0]="Pass(88";
		students_result[2][1][1]="Pass(81)";
		students_result[2][1][2]="Pass(76)";
		students_result[2][1][3]="Fail(32)";
		students_result[2][1][4]="Pass(85)";
		students_result[2][1][5]="Pass(78)"; 
		
		students_result[3][0][0]="Algorithms";
		students_result[3][0][1]="Computer Networks";
		students_result[3][0][2]="Database Systems";
		students_result[3][0][3]="Microprocessors";
		students_result[3][0][4]="Communication Eng.";
		students_result[3][0][5]="Software Engineering";

		students_result[3][1][0]="Pass(91)";
		students_result[3][1][1]="Pass(73)";
		students_result[3][1][2]="Fail(19)";
		students_result[3][1][3]="Pass(80)";
		students_result[3][1][4]="Pass(76)";
		students_result[3][1][5]="Pass(87)";

		
		students_result[4][0][0]="Probability Stats";
		students_result[4][0][0]="Machine Learning";
		students_result[4][0][0]="Compiler Design";
		students_result[4][0][0]="Theory of Computation";
		students_result[4][0][0]="Embedded Systems";
		students_result[4][0][0]="Computer Graphics";

		students_result[4][1][0]="Pass(86)";
		students_result[4][1][0]="Pass(88)";
		students_result[4][1][0]="Pass(84)";
		students_result[4][1][0]="Pass(95)";
		students_result[4][1][0]="Pass(73)";
		students_result[4][1][0]="Pass(90)";

		System.out.println(students_result.length);
		//Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 Subject 4: "+students_result[1][0][3]);
		System.out.println("Semester 2 Subject 5: "+students_result[1][0][4]);

		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4 Subject 3: "+students_result[3][1][2]);
		System.out.println("Semester 4 Subject 6: "+students_result[3][1][5]);

		
		
		

	}

}
