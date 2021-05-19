import java.util.*;
class Hurdle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter range");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for (int i=0; i<n; i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter maximum jumps");
		int k=sc.nextInt();
		int max=a[0];
		for (int i=1; i<n; i++ ) {
			if(a[i]>max)
				max=a[i];
		}
		if(k>max)
			System.out.println(0);
		else
			System.out.println(max-k);
	}
}
