package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		test(20);
		test(true);
		test("Samsung", "apple");
	
	}
	
	public static void test(String s) {
		
		System.out.println(s);
	}
	
	public static void test(String s, String s1) {
		System.out.println(s+s1);
	}
	
	public static void test(int s) {
		
		System.out.println(s);
		
	}
	public static void test(boolean s) {
		System.out.println(s);
	}

}
