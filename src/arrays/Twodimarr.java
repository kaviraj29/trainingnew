package arrays;

public class Twodimarr {

	public static void main(String[] args) {

		String s[][]=new String [3][2];
				
				
				s[0][0]="user1";
				s[0][1]="pass1";
				s[1][0]="user2";
				s[1][1]="pass2";
				s[2][0]="user3";
				s[2][1]="pass3";


				/*
				 * System.out.println(s.length); // Row Length is 3
				 * System.out.println(s[0].length); // coulmn length is 2
				 * System.out.println(s[1][1]);
				 */
					
					
					for(int i=0; i<s.length; i++)			// BASED ON ROW
					{
						
						for(int j=0; j<s[i].length; j++)  //BASED ON COLUMN
						
						{
							
							System.out.println(s[i][j]);
							
						}
						
						
					}
					
					
		
		
	}

}
