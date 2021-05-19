import java.util.*;
class LuckyUnlucky{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int count=0;
		System.out.println("Enter range");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for (int i=0; i<n; i++ ) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for (int i=1; i<n; i++ ) {
			if(a[i]>max)
				max=a[i];
		}
		for (int i=0; i<n; i++) {
			if(a[i]==max)
				count++;
		}
		if(count%2==0)
			System.out.println("unlucky");
		else
			System.out.println("lucky");
	}
}
