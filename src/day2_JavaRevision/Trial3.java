package day2_JavaRevision;
public class Trial3 {
public static void main(String[] args) {
String s="dkj784745997";
String s1="";
int ly = s.length();
for (int i = 0; i < ly; i++) {
	if (s.charAt(i)>='0'&&s.charAt(i)<='9'&&ly==10) {
		s1=s1+s.charAt(i);
	}
}
System.out.println(s1);
if (s.equals(s1)) {
	System.out.println("right");
} else {
	System.out.println("wrong");
}


}
}
