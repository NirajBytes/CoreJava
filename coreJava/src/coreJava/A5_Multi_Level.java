package coreJava;
class Puppy extends Dog1 {
	void puppy() {
		System.out.println("Puppy Darks");
	}
}
public class A5_Multi_Level {

	public static void main(String[] args) {
		Puppy puppy =new Puppy();
		Puppy p=new Puppy();
		p.puppy();
		p.makeSound();
		p.legs();
	}
}
