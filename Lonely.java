import java.util.*;
class Lonely{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("Enter range");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Lonely elements are :");
		Lonely.getLonely(a,n);
		
	}
	public static void getLonely(int a[],int n)
	{
		int pair=0,count=0;
		
		for(int i=0;i<n;i++)
			{
			 for (int j=0;j<n ;j++ )
			  {
				if(a[i]==a[j])
					count++;
			  }
			  if(count == 1)
			  System.out.println(a[i]);
			count=0;
		}
		
		
	 }
}