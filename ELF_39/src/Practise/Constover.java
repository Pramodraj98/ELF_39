package Practise;

public class Constover {
	Constover(){
		System.out.println("space");
	}
	Constover(int a){
		System.out.println("8th floor");
	}
	Constover(char b){
		if(b=='a')
		System.out.println("char");
		else
			System.out.println("var");
	}
	Constover(String c){
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		Constover a1=new Constover('a');
		Constover a2=new Constover('v');
		Constover a3=new Constover(8);
		Constover a4=new Constover(9);
	}
}
