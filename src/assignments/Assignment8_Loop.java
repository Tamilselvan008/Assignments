package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_Loop {

	public static void main(String[] args) {
	
	/*	List<Integer> CreditList=new ArrayList<Integer>();
		CreditList.add(50000);
		CreditList.add(3000);
		CreditList.add(4000); 
		
		int totalcredit=0;
		int numbersofcredit=0;
		int creditSuspicious=0;

		for(Integer credit:CreditList) { 
			
			if(credit > 0) { 
				numbersofcredit++;				
			}
			 if((credit>=10000)) {
				
				System.out.println("Suspicious credit transaction with Amount: "+credit);
				creditSuspicious++;
			} 
			 totalcredit +=credit;
		}
		
	
        
        List<Integer> debitlist=new ArrayList<Integer>();
        debitlist.add(-2000);
        debitlist.add(-15000);
        debitlist.add(-200);
        debitlist.add(-300);
        debitlist.add(-3000); 
        
		int totaldebit=0;
		int numbersofdebit=0;
		int debitSuspicious=0;
		
		for(Integer debit:debitlist) { 
			
			if(debit < 0) { 
				numbersofdebit++;				
			}
			 if((debit <= -10000)) {
				
				System.out.println("Suspicious debit transaction with Amount: "+debit); 
				debitSuspicious++;
			} 
			 totaldebit +=debit;
		}
		System.out.println("----------------------------------------------");
		System.out.println("Total Credit Amount: "+totalcredit);
		System.out.println("Total debit Amount: "+totaldebit);
		System.out.println("Balance amount in account: "+(totalcredit+totaldebit));
	    System.out.println("Overall Credit count: "+numbersofcredit);		
	    System.out.println("Overall debit count: "+numbersofdebit);
	    System.out.println("Total Suspicious count: "+(creditSuspicious+debitSuspicious));
	    System.out.println("Total Transaction: "+(numbersofcredit+numbersofdebit));
	 */    
		
		// After Bharath Comment Updated the Code:
		
		List<Integer> overallList=new ArrayList<Integer>(); 
		overallList.add(50000);
		overallList.add(3000);
		overallList.add(4000); 
		overallList.add(-2000);
		overallList.add(-15000);
		overallList.add(-200);
		overallList.add(-300);
		overallList.add(-3000);   
		
		int totalcredit=0;
		int totaldebit=0;
		int numbersofcredit=0;
		int creditSuspicious=0;
		int debitcount=0;
		int creditcount=0;
		

           for(Integer creditanddebit:overallList) {  
        	   numbersofcredit++;	
			 if((creditanddebit>=10000 ||creditanddebit <=-10000)) {
				System.out.println("Suspicious credit transaction with Amount: "+creditanddebit);
				creditSuspicious++;
			} if(creditanddebit> 0 ) {
				totalcredit +=creditanddebit; 
				creditcount++;
			}else if(creditanddebit< 0) {
				 totaldebit  -=creditanddebit;
				 debitcount++;
			}			
			 
		} 
             System.out.println("Total Credit Amount: "+totalcredit);
             System.out.println("Overall Credit count: "+creditcount);
			 System.out.println("Total debit Amount: "+totaldebit); 
			 System.out.println("Overall debit count: "+debitcount);
			 System.out.println("Overall transaction count: "+numbersofcredit);
					
			    
			 System.out.println("Total Suspicious count: "+creditSuspicious);
			 System.out.println("Balance amount in account: "+(totalcredit-totaldebit));
 
	}

}
