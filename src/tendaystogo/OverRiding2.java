package tendaystogo;

public class OverRiding2 extends OverRiding1 {
	public void dell() {
System.out.println("better");
}
	public void hp() {
System.out.println("worse");
	}
public static void main(String[] args) {
	OverRiding2 or=new OverRiding2();
	or.dell();
	or.hp();
}
	
}

