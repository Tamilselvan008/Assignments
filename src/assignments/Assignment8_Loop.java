package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_Loop {

	public static void main(String[] args) {
	
		List<Integer> CreditList=new ArrayList<Integer>();
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
	     
 
	}

}
