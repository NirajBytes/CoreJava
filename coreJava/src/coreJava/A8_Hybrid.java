package coreJava;

interface Animal5 {
	void eat();
}

interface Mammal {
	void walk();
}

class Dog5 implements Animal5, Mammal {
	public void eat() {
		System.out.println("Dog is Eating");
	}

	public void walk() {
		System.out.println("Dog is walking");
	}
}

class Bulldog extends Dog5 {
	public void bark() {
		System.out.println("Bulldog is barking");
	}
}

public class A8_Hybrid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulldog b = new Bulldog();
		b.eat();
		b.walk();
		b.bark();

	}

}
