package oops.Encapsulation;

public class EmployeeDetaisl {

	public static void main(String[] args) {

		employee e = new employee();
		e.setEmpname("Private");
		e.setSalary("60K");
		e.setEmpDesignation("Tester");
		
		System.out.println(e.getEmpname());
		System.out.println(e.getSalary());
		System.out.println(e.getEmpDesignation());
		
		
	}

}
