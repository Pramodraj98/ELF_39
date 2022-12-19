package Practise;

public class Alphapattern1 {
	public static void main(String[] args) {
		int a=65;
		for(int r=1;r<=4;r++) {
			for(int space=3;space>=r;space--) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print((char)a);
				a++;
			}
			
			a='A';
		}
		System.out.println();
	}

}
