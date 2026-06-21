package pattern_programs;

public class Pattern07 {
	public static void main(String[] args) {
		/*
		  
		  * * * * *
		    * * * *
		      * * *
		        * *
		          *
		  
		 */
		int n=5;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=n+1-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
