import java.util.*;
class EquilbrilumArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[12];
		int w[]=new int[12];
		int k=0,s1=0,s2=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			 {
			 	for(int j=i+1;j<n;j++)
			 	{
			 		for(int p=0;p<j;p++)
			 		{
			 			s1=s1+a[p];
			 		}
			 		for(int l=j+1;l<n;l++)
			 		{
			 			s2=s2+a[l];
			 		}
			 		if(s1==s2)
			 		{
			 			w[k]=i+1;
			 			k++;
			 		}
			 	}
			 	s1=0; s2=0;
			 }
			 for (int i=0; i<k; i++) {
			System.out.print(" "+w[i]);
		}
 }
}