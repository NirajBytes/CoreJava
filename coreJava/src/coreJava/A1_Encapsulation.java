package coreJava;
//Wrapping of data in single unit is encapsulation
public class A1_Encapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setSalary(200000);
		System.out.println(e.getSalary());
		e.setName("Amit");
		System.out.println(e.getName());

	}

}
