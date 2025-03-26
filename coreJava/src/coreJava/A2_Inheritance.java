package coreJava;
//The Characteristic of deriving properties from parent by child class is Inheritance

//example of Dynamic Dispatch
class Animal{
	void makeSound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog Darks");
	}
	
}
public class A2_Inheritance {

	public static void main(String[] args) {
		//the process of assigning ref of child class to parent class is called Upcasting
		Animal a=new Dog();//Dynamic Dispatch
		a.makeSound();

	}

}
