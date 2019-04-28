package day2_JavaRevision;

public class C extends A_B {
	int b=70;
	public void two() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		C dd=new C();
		dd.two();
	}

}
