package assignments;

public class Assignment10_ArrayandLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	  int[] numbers= {12, 34, 11, 36, 87, 98, 93};
	  int third=0;
	  int second=0;
	  int first=0;
	  
	  
		for (int numbercall:numbers) { 
			if(numbercall>first) { 	
			third=second;
			second=first;
			first=numbercall;
		}else if (numbercall > second && numbercall != first) {
            third = second;
            second = numbercall;
        } 
		else if(numbercall > third && numbercall != second && numbercall != first) {
            third = numbercall;
        }
		     		}

	//	System.out.println("1st largest: " + first);
        System.out.println("2nd largest: " + second);
        System.out.println("3rd largest: " + third);
	
	// Actually bharath code is Simple and able to check all Largest number using index position
			
		} 
		

	}




/*int[] prices = {7, 1, 5, 3, 6, 4}; 
		 		
		 int minPrice = 0;
	     int maxProfit = 0;
		 for(int price:prices) { 
			 if(price < 0) {
				 minPrice = price; 
			 } else if (price - minPrice > maxProfit) {
	                maxProfit = price - minPrice; 
	                }
			
		 } 
	//	 return maxProfit1;
		 
		
		 System.out.println(" largest number is :" + maxProfit);

 */


