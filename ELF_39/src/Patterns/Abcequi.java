package Patterns;

public class Abcequi {
public static void main(String[] args) {
	char c ='A';
	for(int i=1;i<=3;i++) {
		for(int j=1;j>=i;j--) {
			System.out.print(" ");
		}
		System.out.println(c++);
	}
}
}

