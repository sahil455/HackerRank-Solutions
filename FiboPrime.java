import java.util.*; 

class FiboPrime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				FiboPrime.prime(n);
			else
			{
				int r=FiboPrime.fibo(i);
		        System.out.print(r+" ");
	        }
		}
	}
	public static void prime(int n)
	{
		System.out.print(" a");
    }
	public static int fibo(int i)
	 {
	 	if(i==0 || i==1)
	 		return 0;
	 	else
	 		return (fibo(i-1)+ fibo(i-2));
	 }
}