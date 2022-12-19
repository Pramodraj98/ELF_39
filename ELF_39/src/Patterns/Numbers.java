package Patterns;

import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Row estappa");
	int row=sc.nextInt();
	System.out.println("Column estappa");
	int column=sc.nextInt();
	
	for(int i=1;i<=row;i++) {
		int n=i;
		for(int j=1;j<=column;j++) {
			if(n<10 && n>0) {
				System.out.print("0" +n+" ");
			}
			else {
				System.out.print(n+" ");
			}
			n=n+5;
		}
		System.out.println();
	}*/
	
	int n=1;
	int c=10;
	for(int i=1;i<=5;i++) {
		if(i%2==0) {
		for(int j=1;j<=5;j++) {
			if(c>0 && c<10) {
				System.out.print("0"+c--+" ");
			}
			else {
				System.out.print(c--+" ");
			}
		}
		c=c+15;		
	}
		else {
			for(int j=1;j<=5;j++) {
				if(n<10 && n>0) {
					System.out.print("0"+n++ +" ");
				}
				else {
					System.out.print(n++ +" ");
				}
			}
			n=n+5;
		}
		System.out.println();
}
}
}
