package day2_JavaRevision;

import java.util.Scanner;

public class SwapWith3rd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
