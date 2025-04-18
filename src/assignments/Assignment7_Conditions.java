package assignments;

public class Assignment7_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// All Condition satisfied Data
		String customerName="John Doe"; 
		int creditScore=720;
		double income=50000.0;
		boolean isEmployed=true;
		float deptToincomeRatio=35.0f;
/*		
		//All deptToincomeRatio failed Data
		String customerName="John Doe"; 
		int creditScore=720;
		double income=50000.0;
		boolean isEmployed=true;
		float deptToincomeRatio=65.0f;
		
		//All isEmployed failed Data 
		String customerName="John Doe"; 
		int creditScore=720;
		double income=50000.0;
		boolean isEmployed=false;
		float deptToincomeRatio=35.0f;
		
		//All income failed Data 
		String customerName="John Doe"; 
		int creditScore=720;
		double income=40000.0;
		boolean isEmployed=true;
		float deptToincomeRatio=35.0f;
		
		//All creditScore failed Data
		String customerName="John Doe"; 
		int creditScore=520;
		double income=50000.0;
		boolean isEmployed=true;
		float deptToincomeRatio=35.0f; 
		
		// creditScore Above 750 Data 
		String customerName="John Doe"; 
		int creditScore=720;  
*/
		
		if(creditScore >=750)
		{
			System.out.println(customerName+"  No other formalities Loan  Automatically Approved !!");
		}
		else if(creditScore >=650 && creditScore<=750)
			{
				System.out.println(customerName+" your Credit Score botween 650 to 750!");
				if(income>=50000) { 
					System.out.println(customerName+ " Income also 50000!");
					if(isEmployed == true) {
						System.out.println(customerName+ "  your an Employed!");
						if(deptToincomeRatio <=40) {
							System.out.println(customerName+ " Hey Your deptToincomeRatio less than 40% - So your Loan is approved!!!");
						}
						if(deptToincomeRatio >40) {
							System.out.println(customerName+ " Your Loan is Denied - deptToincomeRatio is greater than 40 %");
						}
					}
					else if(isEmployed == false) {
						System.out.println(customerName+" Your currenly  UnEmployed -- so you not eligible for this Loan ^^^");
					
					}
				}
				else if (income <=50000) {
					System.out.println(customerName+" Your Income Lesser than the 50000 - so you not eligible for this Loan !!! ");
				}
			}
				
		else {
			System.out.println(customerName+" Sorry Your Loan Process in Denied###");
		}


	}

}
