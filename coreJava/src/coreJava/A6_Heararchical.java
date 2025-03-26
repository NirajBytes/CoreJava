package coreJava;

class Parrot extends Animal1 {
	void Sound() {
		System.out.println("Parrot's Sound");
	}
}
class Horse{
	void Sound() {
		System.out.println("Horse's Sound");
	}
}
public class A6_Heararchical {
	Parrot parrot =new Parrot();
	Horse horse=new Horse();
	public static void main(String[] args) {
		A6_Heararchical a=new A6_Heararchical();
		a.parrot.Sound();
		a.horse.Sound();
	}

}
