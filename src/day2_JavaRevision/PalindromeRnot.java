package day2_JavaRevision;

import java.util.Scanner;

public class PalindromeRnot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	int n = sc.nextInt();
	int a, i=0,j=0;
	a=n;
	while (a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
if (n==j) {
	System.out.println("palindrome");
} else {
System.out.println("not palindrome");
}
	

}
}
