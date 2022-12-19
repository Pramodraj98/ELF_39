package Patterns;

public class Alphanumequi {
public static void main(String[] args) {
	int num=1;
	for(int i=1;i<=5;i++) {
		char c='A';
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print(num++ +" ");
			}
			else {
				System.out.print(c++ +" ");
			}
		}
		System.out.println();
	}
}
}
