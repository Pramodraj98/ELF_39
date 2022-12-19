package Practise;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<7;i++) {
			if(i==0||i==1){
				System.out.println(i);
			}
			else {
				sum=a+b;
				a=b;
				b=sum;
				System.out.println(sum);
			}
		}
		
	}
}
