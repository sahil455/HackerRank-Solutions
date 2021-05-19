import java.util.*;
class MinMax{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long int arr[]=new int[10];
		int n=sc.nextInt();
		for (int i=0; i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		MinMax.miniMaxSum(arr,n);
	}
	static void miniMaxSum(int[] arr,int n) {

        int s[]=new int[5];
        int p=0,sum=0;
        //k=sum[0];
        for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(i!=j)
                  sum+=arr[j];
              }
             s[p]=sum;
             p++;
             sum=0;
         }
         int min=s[0];
         
         for (int i=1; i<p;i++ ) {
         	if(min>s[i])       	
         		min=s[i];
         }
         int max=s[0];
         for (int i=1; i<p;i++ ) {
         	if(max<s[i])       	
         		max=s[i];
         }
         
         System.out.print(max +" "+ min);

    }

}