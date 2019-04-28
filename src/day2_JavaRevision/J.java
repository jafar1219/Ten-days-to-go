package day2_JavaRevision;

import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		int a, i=0,j=0;
		
		a=n;
		while(a>0) {
			i=a%10;
			j=i+j;
			a=a/10;
		}
	
		System.out.println(j);		
		}}

