package pattern_programs;

public class Pattern09 {
	public static void main(String[] args) {
		/*
		     
		     *********
		      *******
		       *****
		        ***
		         *
		 */
		int n=5;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<row;col++) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=2*(n-row)+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} 

}
