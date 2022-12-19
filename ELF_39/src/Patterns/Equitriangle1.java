package Patterns;

public class Equitriangle1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			char c='a';
			for(int space=5;space>i;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(c++);
			}
		for(int j=1;j<=i;j++) {
			System.out.print(c++);
		}
		System.out.println();
	}
	}
}
