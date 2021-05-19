import java.util.*;
class MinimumDistance{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		MinimumDistance.getMinimum(a,n);
	}
	public static void getMinimum(int a[],int n)
	 {
	 	int ar[]=new int[10];int k=0;
	 	for(int i=0;i<n;i++)
	 		 {
	 		 	for (int j=i+1;j<n ;j++ ) {
	 		 		if(a[i]==a[j])
	 		 		{
	 		 			ar[k]=(Math.abs(i-j));
	 		 			System.out.println("Bug"+ar[k]);
	 		 			k++;
	 		 		}

	 		 	}
	 		 	System.out.println(k);
	 		 }
	 		int min=ar[0];
	 		System.out.println(min);
	 		 for(int i=1;i<k;i++)
	 		 {
	 		 	if(ar[i]<min){
	 		 		min=ar[i];
	 		 		System.out.print(" "+min);
	 		 	}
	 		 			
	 		 }
	 		System.out.println(" "+min);
	 		 
	 }
}