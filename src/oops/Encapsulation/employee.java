package oops.Encapsulation;

public class employee {
	
	private String Empname;
	private String Salary;
	private String EmpDesignation;
	
	
	public void setEmpname(String name) {
		this.Empname=name;
		
	}
	
	public String getEmpname()
	{
	
		return Empname;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getEmpDesignation() {
		return EmpDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}
	
}

	
