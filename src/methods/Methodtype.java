package methods;

public class Methodtype {

	public static void main(String[] args) {
		
		//Public - Access specifier
		//Static-methodtype
		//void -return
		

		add();
		
		//Object Reference from non static to static
		
		Methodtype m=new Methodtype();
		m.mul();
		

	}
	
	public static void add() {  //User defined method
		
		int a=90;
		int b=10;
		int c=a+b;
		
		System.out.println(c);
		
			
	}
	
	public  void mul() {
		int a=20;
		int b=20;
		int c=a*b;
		
		System.out.println(c);
		sub();
	}
	
	public void sub() {
		int a=20;
		int b=10;
		int c=a+b;

		System.out.println(c);
		add();
	}
	
	
	
	
	
	

}
