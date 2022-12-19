package Patterns;

public class Revequi_easy {
public static void main(String[] args) {
	int n=4;
	for(int r=n-1;r>=1;r--) {
		for(int space=1;space<=n-r;space++) {
			System.out.print("_");
		}
		for(int col=1;col<=2*r-1;r++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
