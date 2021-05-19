import java.util.*;
class lastBitArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		String s=Arrays.toString(a);
		int c=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]==9)
			{
				a[i]=0;
				c++;
			}
			else{
				a[i]=a[i]+1;
				break;
			}
		}
		String s1;
		System.out.println("Input : "+s);
		if(c==n)
		{
			int arr[]=new int[n+1];
			arr[0]=1;
			s1=Arrays.toString(arr);
		System.out.println("Output : "+s1);
		}
		else{
			s1=Arrays.toString(a);
		System.out.println("Output : "+s1);
		}
	}
}