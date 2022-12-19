package Patterns;

import java.util.Scanner;

public class Numalphadia {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		char a='A';
		int b=1;
		for(int j=1;j<=i;j++){
			
			if(i==j) {
				System.out.print("@");
			}
			else {
				System.out.print(a++);
			}
			}
		for(int j=6;j>=i;j--) {
			System.out.print(b++);
		}
		
		System.out.println();
		}
		
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		int k=1;
		char c='A';
		for(int j=1;j<=num;j++) {
			if(j==i) {
				System.out.print("@");
			}
			else if(i<j) {
				System.out.print(c++);
			}
			else {
				System.out.print(k++);
			}
		}
		System.out.println();
	}*/
	}
}


