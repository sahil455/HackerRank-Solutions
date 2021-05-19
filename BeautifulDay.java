import java.util.*;
class BeautifulDay{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter first no");
		float n1=sc.nextInt();
		System.out.println("Enter second no");
		float n2=sc.nextInt();
		System.out.println("Enter Divisor");
		int k=sc.nextInt();
		for(float i=n1;i<=n2;i++)
		{
			float n=Math.abs(i-(BeautifulDay.reverse(i)))/k;
			System.out.println(n);	
			if(n==Math.floor(n))
				count++;
		}
		System.out.println(count);
	}
	public static int  reverse(float n)
	{
		int rev=0,a=0;
		int j=(int)n;
        while(j!=0)
        	 {
        	 	a=j%10;
        	 	rev=rev*10+a;
        	 	j=j/10;
        	 }
        return (rev);	
	}
}