package arrays;

public class Singledimarr {

	public static void main(String[] args) {

		int a[]=new int[3];
		a[0]=30;
		a[1]=40;
		a[2]=60;
		a[3]=80;
		
		
		/*System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);*/
		
		int b[]=a.clone();
		System.out.println(b[3]);
		
		
		
		String s[]=new String[3];
		s[0]="Samsung";
		s[1]="Apple";
		s[2]="Oneplus";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		String s1[]=s.clone();
		System.out.println(s1[1]);
		
		
		String s2[]=s1.clone();
		System.out.println(s2[1]);
		
		
		
		
		
		/*for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
