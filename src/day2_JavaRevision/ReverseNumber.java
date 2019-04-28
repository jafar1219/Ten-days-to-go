package day2_JavaRevision;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
	int n = sc.nextInt();
	int i=0,j=0;
	
	while (n>0) {
		i=n%10;
		j=(j*10)+i;
		n=n/10;
		}
	System.out.println(j);
	
	
	}
}
