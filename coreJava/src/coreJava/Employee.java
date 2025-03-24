package coreJava;

public class Employee {

	private int salary;
	private String name;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>0)
		this.salary = salary;
		else
			this.salary=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
