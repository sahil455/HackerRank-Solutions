import java.util.*;
class IcecreamParlor{
	
public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter no of trips");
 	int t=sc.nextInt();
 	for (int i=0; i<t;i++ ) {
 		IcecreamParlor.createAarry();
 	}

 }
	public static void createAarry()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter no of flavours");
		int n=sc.nextInt();
		System.out.println("Enter amount of money");
		int m=sc.nextInt();
		for (int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		for (int i=1;i<=n ;i++ ) {
			for (int j=i+1; j<=n;j++ ) {
				if ((a[i]+a[j]) == m) {
					System.out.println(i+" "+j);					
				}
			}
			
		}
	}

}
