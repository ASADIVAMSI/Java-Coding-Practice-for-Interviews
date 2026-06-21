package pattern_programs;

public class Pattern08 {
	public static void main(String[] args) {
		/*
		      *
		     ***
		    *****
		   *******
		  *********
	  
	    */
		int n=5;
		
		for(int row=1;row<=n;row++) {
			//spaces
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			//stars
			for(int col=1;col<=row*2-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
} 
