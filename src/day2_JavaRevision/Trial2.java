package day2_JavaRevision;

import java.util.Scanner;

public class Trial2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	for (int k = 0; k <5; k++) {

	int n = sc.nextInt();
	int a,i=0,j=0;
	a=n;
	while (a>0) {
		i=a%10;
		j=(i*i*i)+j;
		a=a/10;
	}
if (n==j) {
	System.out.println("armstrong");
}else {
	System.out.println("not armstrong");
}}}
}
