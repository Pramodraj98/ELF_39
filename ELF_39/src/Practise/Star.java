package Practise;

public class Star {
	public static void main(String[] args) {
		
	for(int r=1;r<=4;r++) {
		for(int space=3;space>=r;space--) {
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}

}
