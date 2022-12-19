package Practise;

public class Largest {
	public static void main(String[] args) {
		int a[]= {3,1,2,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		/*System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}*/
		//System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);//second largest
	}
}
