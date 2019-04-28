package tendaystogo;

public class StringSpecial {
	public static void main(String[] args) {
	
	String s="Ddv34@&*H";
	for (int i = 0; i <=s.length()-1; i++) {
		if (s.charAt(i)>='a' && s.charAt(i)<='z') {
			System.out.println("lower cases are:"+s.charAt(i));
		}else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
			System.out.println("capital letters are:"+s.charAt(i));
		}else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
			System.out.println("numbers are:"+s.charAt(i));
		}else if (s.charAt(i)=='@' || s.charAt(i)=='&'|| s.charAt(i)=='*'|| s.charAt(i)==';' ) {
			System.out.println("special characters are:"+s.charAt(i));
		}
	}

}}
