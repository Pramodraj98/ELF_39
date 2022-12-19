package Practise;

public class factornprintindivi {
	public static void main(String[] args) {
		//for(int j=1;j<=100;j++) {for range
int num=145;
int sum=0;
int temp=num;
while(num>0) {
	int reminder=num%10;
	System.out.println(reminder);
	int fact=1;
	
	for(int i=reminder;i>=1;i--) {
		fact=fact*i;
		
	}
	
	sum=sum+fact;
	num=num/10;
}
if(sum==temp) {
	System.out.println("It is strong num");
}
else {
	System.out.println("It is not");
}

	}
}
	
