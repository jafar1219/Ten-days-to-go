package day2_JavaRevision;

public class VowelsAndConsonant {
public static void main(String[] args) {
	int vowel=0,cons=0;
	String s="jafarsadiq";
	int ly = s.length();
	for (int i=0;i<ly;i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			vowel=vowel+1;
		}
		else {
			cons=cons+1;
		}
	}
	System.out.println(ly);
	System.out.println("consonant count:"+cons);
	System.out.println("vowel is :"+vowel);
}}
