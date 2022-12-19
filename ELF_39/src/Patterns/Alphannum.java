package Patterns;

public class Alphannum {
public static void main(String[] args) {
	char c='A';int d=1;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
			if(i==2 && j==2 || i==2 && j==3 || i==3 && j==2 ||i==3 && j==3) {
		System.out.print(d++);
    }
			else {
				System.out.print(c++);
			}
			}
	System.out.println();
}
}
} 
