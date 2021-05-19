import java.util.*;
class CatandMouse{
	
public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter no of queries");
 	int q=sc.nextInt();
 	for (int i=0; i<q;i++ ) {
 		CatandMouse.createAarry();
 	}
 }
	public static void createAarry()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Enter queries");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		if( Math.abs(a[2]-a[1]) < Math.abs(a[2]-a[0]) )
			System.out.println("Cat B catches first");
		if( Math.abs(a[2]-a[1]) > Math.abs(a[2]-a[0]) )
			System.out.println("Cat A catches first");
		if( Math.abs(a[2]-a[1]) == Math.abs(a[2]-a[0]) )
			System.out.println("Mouse C can escape");
	}
}
