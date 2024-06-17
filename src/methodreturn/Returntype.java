package methodreturn;

public class Returntype {

	public static void main(String[] args) {

		int d=add()/2;
		System.out.println(d);
		
		
	}
	
	public static int add() {
		
		int a=80;
		int b=20;
		int c=a+b;
		
		//System.out.println(c);
		return c;
		
		
		
	}

}
