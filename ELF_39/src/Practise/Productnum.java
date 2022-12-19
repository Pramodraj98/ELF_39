package Practise;
import java.util.Scanner;

public class Productnum {
public int m1(int num) {
	int prod=1;
	while(num!=0) {
		int lastnum=num%10;
		prod=prod*lastnum;
		num=num/10;
	}
	return prod;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=sc.nextInt();
	Productnum a1=new Productnum();
	int result=a1.m1(a);
	System.out.println(result);
}
}
