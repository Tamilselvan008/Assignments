package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment8_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	/*	Map<Integer,Integer> AmountCredit=new LinkedHashMap<Integer,Integer>();
		AmountCredit.put(1, 50000);
		AmountCredit.put(3, 3000);
		AmountCredit.put(7, 4000);

		Map<Integer,Integer> AmountDebit=new LinkedHashMap<Integer,Integer>();
		AmountDebit.put(2, 2000);
		AmountDebit.put(4, 15000);
		AmountDebit.put(5, 200);
		AmountDebit.put(6, 300);
		AmountDebit.put(8, 3000);  
		
	*///	List<Map<Integer,Integer>> PostiveValue=new ArrayList<Map<Integer,Integer>>();
		//PostiveValue.add(AmountCredit);
	//	PostiveValue.add(AmountDebit); 
		
	//	for (Map<Integer,Integer> amount:PostiveValue ) {
	//	System.out.println(amount);
	//	}
		
		List<Integer> TransactionList=new ArrayList<Integer>();
		TransactionList.add(1);
		TransactionList.add(2);
		TransactionList.add(3);
		TransactionList.add(4);
		TransactionList.add(5);
		TransactionList.add(6);
		TransactionList.add(7);
		TransactionList.add(8);
	//	System.out.println("Total Transaction: "+TransactionList.size());  	
		for(Integer Trans:TransactionList) {
			
			System.out.println("Total Transaction: "+Trans);
		}
		
		List<Integer> CreditList=new ArrayList<Integer>();
		CreditList.add(50000);
		CreditList.add(3000);
		CreditList.add(4000);
		
		int Credit=CreditList.get(0)+CreditList.get(1)+CreditList.get(2);
        System.out.println("Total Number of Credits: "+Credit); 
        
        
        
        List<Integer> debitList=new ArrayList<Integer>();
        debitList.add(-2000);
        debitList.add(-15000);
        debitList.add(-200);
        debitList.add(-300);
        debitList.add(-3000); 
        
        int Debit=debitList.get(0)+debitList.get(1)+debitList.get(2)+debitList.get(3)+debitList.get(4);
        System.out.println("Total Number of Credits: "+Debit);
        
        System.out.println("Balance Amount in Account: "+(Credit+Debit));  
        
        
        // Pending Loop
        */
	}

}
