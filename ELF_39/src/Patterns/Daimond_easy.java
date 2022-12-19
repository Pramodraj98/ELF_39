package Patterns;

public class Daimond_easy {
public static void main(String[] args) {
	int n=4;
	for(int r=1;r<=n;r++) {
		for(int space=1;space<=n-r;space++) {
			System.out.print(" ");
		}
		for(int c=1;c<=2*r-1;c++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int r=n-1;r>=1;r--) {
		for(int space=1;space<=n-r;space++) {
			System.out.print(" ");
		}
		for(int c=1;c<=2*r-1;c++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
