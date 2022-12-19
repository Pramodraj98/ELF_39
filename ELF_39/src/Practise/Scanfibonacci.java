package Practise;

import java.util.Scanner;

public class Scanfibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	System.out.println("Enter the range");
	int sum=sc.nextInt();
	int c;
	for(int i=0;i<sum;i++) {
		if(i==0||i==1){
			System.out.println(i);
		}
		c=a+b;
		a=b;
		b=c;
		System.out.println(" "+c);
	}
}
}
