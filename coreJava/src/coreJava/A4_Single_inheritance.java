package coreJava;

class Animal1 {
	void legs() {
		System.out.println("Has 4 legs");
	}
}

class Dog1 extends Animal1 {
	void makeSound() {
		System.out.println("Dog Darks");
	}
}

public class A4_Single_inheritance {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.makeSound();
		d.legs();
	}
}
