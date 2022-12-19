package Patterns;

public class Boxspace {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1||i==5) {
				System.out.print("*"+" ");
			}
			else if(j==1||j==5) {
				System.out.print("*"+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
//OR

/* public class Boxspace {
public static void main(String[] args) {
for(int i=1;i<=5;i++){
if(i==1||i==5){
for(int j=1;j<=5;j++){
	System.out.print("*");
}
}
else {
for(int j=1;j<=5;j++){
if(j==1||j==5){
syso(*)
}
else{
syso space
}
}
*/