package Practise;

public class Primenum {
public static void main(String[] args) {
	int num=7;
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Composite number");
	}
}
}
