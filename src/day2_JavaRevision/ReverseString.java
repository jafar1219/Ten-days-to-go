package day2_JavaRevision;

public class ReverseString {
	public static void main(String[] args) {
		String s="jafar sadiq";
		String s1="";
		int kk = s.length();
		for (int i = kk-1;i>=0; i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
	}
}
