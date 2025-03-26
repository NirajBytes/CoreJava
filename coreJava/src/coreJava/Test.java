package coreJava;

public class Test {

	public static void main(String[] args) {
		
		
		//Scenario 1
		X x=new X();
		System.out.println(x.a);
		System.out.println(x.b);
		x.m1();
		x.m2();
//		x.m3(); not accessible
		
		//Scenario 2
		Y y=new Y();
//		System.out.println(y.a); not accessible
		System.out.println(y.b);
		System.out.println(y.c);
//		y.m1(); not accessible
		y.m2();
		y.m3();
		
		//scenario 3 //Dynamic Dispatch
		X x1 =new Y();
		System.out.println(x1.a);
		System.out.println(x1.b);
//		System.out.println(x1.c); not 	accessible
		x1.m1();
		x1.m2();
//		x1.m3();not accessible
		
		//scenario 4 //Static Dispatch
		Y y1=new Y();
		X x2=new Y();
//		y1=x2;   //not accessible
		System.out.println(y1.a);
		System.out.println(y1.b);
		System.out.println(y1.c);
		y1.m1();
		y1.m2();
		y1.m3();
		
//		x2 is of type X, so it cannot be directly assigned to y1, which expects a Y type.

//		Even though x2 is referring to an instance of Y, its declared type is X. Java doesn't allow assigning a superclass reference (X) to a subclass reference (Y) without an explicit cast.

		//scenario 5
//		Y y=new X();

		
		

	}

}
