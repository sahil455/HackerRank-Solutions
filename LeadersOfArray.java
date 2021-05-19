import java.util.*;
class LeadersOfArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[12];
		int w[]=new int[12];
		int k=0,sum=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		w[k]=a[n-1];
		k++;
		for (int i=0;i<n ;i++ ) 
		{
			if(a[i+1]>a[i])
			{
				for(int j=i+2;j<=n;j++)
				{
					sum=sum+a[j];
					System.out.println("sum is "+sum);
							
				}
				if(sum<=a[i+1])
					{
						w[k]=a[i+1];
						k++;
				    }			
			}
			sum=0;
		}
		for (int i=0; i<k; i++) {
			System.out.print(" "+w[i]);
		}
	}
}
