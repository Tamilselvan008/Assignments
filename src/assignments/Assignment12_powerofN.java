package assignments;

public class Assignment12_powerofN {

	public static void main(String[] args) {
		//Question_1
		double x=2.00000;
		int n=10;
		//Question_2
	//	double x=2.10000;
	//	int n=3;
		//Question_3
	//	double x=2.00000;
	//	int n=-2;
		double result = 1; 
		long power=n;
		
		 if (power < 0) {
	            x = 1 / x;
	            power = -power;
	        } 
		 while (power > 0) {
	            if (power % 2 == 1)  //this condition odd number always pass , even number always fail
	            {
	                result *= x;
	                System.out.println("result value:"+result); 
	            }
	            x *= x;
	            System.out.println("x value:"+x); 
	            power /= 2;
	            System.out.println("power value:"+power); 
	        }
		 System.out.println("Output:"+result); 
	}

}
