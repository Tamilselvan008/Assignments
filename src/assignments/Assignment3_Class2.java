package assignments;

public class Assignment3_Class2   {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Assignments3_Class1 obj=new Assignments3_Class1();
		
		String[] empname= {obj.Name1,obj.Name2,obj.Name3};
		int[] empids= {obj.id1,obj.id2,obj.id3}; 
		
		System.out.println("Employee Name: "+empname[0]+",  " + "Employee id: "+empids[0]);
		System.out.println("Employee Name: "+empname[1]+",  " + "Employee id: "+empids[1]);
		System.out.println("Employee Name: "+empname[2]+",  " + "Employee id: "+empids[2]);
	
	}

}
