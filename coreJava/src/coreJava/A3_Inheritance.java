package coreJava;
//The Characteristic of deriving properties from parent by child class is Inheritance


public class A3_Inheritance {

	public static void main(String[] args) {
		//the process of assigning ref of child class to parent class is called Upcasting
		Animal a=new Dog();//Dynamic Dispatch
		a.makeSound();

	}

}
