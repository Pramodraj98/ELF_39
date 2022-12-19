package Practise;

import java.util.Scanner;

public class Factorial {
public static int fact(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}

	return fact;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int result=Factorial.fact(a);
	System.out.println("The factorial is "+result);
}
}
