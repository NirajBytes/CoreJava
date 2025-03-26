package coreJava;

interface Parrot1{
	void Sound();
}
interface Horse1{
	void Sound();
}

public class A7_Multiple implements Parrot1, Horse1{
	@Override
	public void Sound() {
		System.out.println("The parrot and horse are making a sound!");
	}

	public static void main(String[] args) {
		A7_Multiple multiple = new A7_Multiple();
		multiple.Sound();
	}
}