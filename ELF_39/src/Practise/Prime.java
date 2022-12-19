package Practise;

public class Prime {
	public static void main(String[] args) {
		int num=2;
		boolean a=true;
	for(int j=2;j<num;j++) {
		if(num%j==0) {
			a=false;
			break;
		}
	}
	if(a==true) {
		System.out.println("Prime num");
	}
	else {
		System.out.println("Not Prime");
	}
	}
	
}
