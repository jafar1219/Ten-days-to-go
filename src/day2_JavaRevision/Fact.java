package day2_JavaRevision;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		for (int j = 0; j <=5; j++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
	System.out.println("factorial no is:"+fact);
	
		}
	
	}
}
