package statementloops;

public class forloop {

	public static void main(String[] args) {

		/*for(int i=1; i<=10; i++) 
		{
			System.out.println(i);
		}*/
		
		//Nested for loop
		
		for(int i=1; i<=3; i++)
		{
			
			for (int j=1; j<=5; j++)
			{
				System.out.println("The Value of I is--> "+ i + " The Value of J is--> "+j);
			}
			
		}
		
		
	}

}