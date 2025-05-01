package assignments;

public class Assignments13_primenumber {

	public static void main(String[] args) {
	  
		int number=-1;
		boolean isprime=true;
		int i=2;
		
		while(i<number) {
			if(number % i==0) {
				isprime=false;
			}
			i++;
		}	
		
		if(isprime) {
			System.out.println("Number: "+number+" is prime number => "+isprime);
		}
		else if(number<=1) {
			isprime=false;
			System.out.println("Less then 1 is not a Prime Number "+number+"=> "+isprime);
		} 
		else {
			System.out.println("Number: "+number+" is not prime number => "+isprime);
		}
		

	}

}
