package assignments;

public class Assignment14_pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		// Pramid part (first half)
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" "); 
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j +" "); 
			} 
			System.out.println();
		} 
		
		// Complete Daimond shape (second part of Pramid)
		for(int i=4; i>=1;i--) {
			for(int k=n;k>i;k--) {
				System.out.print(" "); 
			}
			for(int j=1; j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		

	}

}
