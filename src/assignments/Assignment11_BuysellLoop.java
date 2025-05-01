package assignments;

public class Assignment11_BuysellLoop {

	public static void main(String[] args) {
		 int[] prices = {7, 1, 5, 3, 6, 4}; 
		 //Question_1:     
	        int temp = 0;
	        int maxii = 0;
	        int buyDay = 0;
	        int sellDay = 0;
	        
	        for (int i = 0; i < prices.length; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	            	temp =prices[j]-prices[i];
	       // System.out.println(temp);
	            	if(temp >maxii) { 
	            		maxii=temp; 
	            		buyDay=i+1;
	            		sellDay=j+1;
	            		 // System.out.println(maxii);
	            		}
	            	}
	              
	                } 
	   //Question_2:     
	        int[] price2 = {7, 6, 4, 3, 1}; 			
	        int dummy = 0;
	        int notransaction = 0;
	 //       int buyed = 0;
	//        int selled = 0;
	        for (int i = 0; i < price2.length; i++) {
	            for (int j = i + 1; j < price2.length; j++) {	            	
	            	dummy =price2[j]-price2[i];
	            	if(dummy >notransaction) { 
	            		notransaction=dummy; 
	            		
	            		
	            		}
	            	}	              
	                }   
	        	           	        
	        System.out.println("Maximum Profit: " + maxii);
	        System.out.println("Buyed " + buyDay);
            System.out.println("Selled " + sellDay);
            
            System.out.println("Minimum Profit: " + notransaction);
            //condition not passed so still remain no transaction as 0ssssss
	        }
		
	}

