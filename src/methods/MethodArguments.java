package methods;

public class MethodArguments {

	public static void main(String[] args) {

		add(10, 10);
		add(20, 20);
		add(958, 583);
	
		mul(586, 758);
		 mul(25, 35);
	}
	
	public static void add(int a, int b)
	{
		
		int c=a+b;
		
		System.out.println(c);
		
	}
	public static void mul(int d, int e) {
		
		
		int f=d*e;
		System.out.println(f);
	}
	

}
