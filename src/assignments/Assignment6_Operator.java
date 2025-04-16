package assignments;

public class Assignment6_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] subject= new String[3];
		subject[0]="Suresh";
		subject[1]="mahesh";
		subject[2]="Naresh";
		
		int[] marks= new int[3];
		marks[0]=75;
		marks[1]=80; 
		marks[2]=82;
		
		marks[0] +=10;
		marks[1] +=10;
		marks[2] +=10;
		
		float avg = marks[0]+marks[1]+marks[2];
		
		System.out.println(subject[0] +" is :"+marks[0]);
		System.out.println(subject[1] +" is :"+marks[1]);
		System.out.println(subject[2] +" is :"+marks[2]);
		System.out.println((avg/3));

	}

}
