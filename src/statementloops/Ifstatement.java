package statementloops;

public class Ifstatement {

	public static void main(String[] args) {

		/*int a= 60;
		int b=77;
		int c=75;
		
		
		//If condition int i = 90;
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		
		//if else
		
		if(a<b)
		{
			System.out.println("--A is greater than B");
		}
		
		else
		{
			System.out.println("B is greater than A");
		}
		
		//else if
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else if(b>c)
		{
			System.out.println("B is greater than C");
		}
		else 
		{
			System.out.println("C is greater than A & B");
		}*/
		
		int a= 100;
		int b=770;
		int c=79;
		
		
		//Nested If
		
		if(b>a)
		{
			if(b>c)
			{
				System.out.println("B is greater than C");
			}
			else if(c<a)
			{
				System.out.println("C is greater than a");
			}
			else
			{
				System.out.println(" C is grater than A & B");
			}
		}
		else
		{
			System.out.println("--- c is greater than a & B");
		}
		
		
		
		
		
		
		
		
	}

}
