package Patterns;

public class Revl {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=i;j<=5;j++) {//or for(int j=5;j>=i;j--)
			System.out.print("*");
		}
		System.out.println();
	}
}
}
