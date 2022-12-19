package Practise;

import java.util.Scanner;

public class Primesum {
	public static boolean prime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range");
			int range=sc.nextInt();
			int sum=0;
			for(int i=1;i<=range;i++) {
				if(prime(i)==true) {
					sum=sum+i;
				}
			}
			System.out.println(sum);
}
}
