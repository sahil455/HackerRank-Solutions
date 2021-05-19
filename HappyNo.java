import java.util.*;
class HappyNo
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0,s=0;
	while(n>9)
	 {
        while(n!=0)
        {
        	a=(int)Math.pow(n%10,2);
        	s=s+a;
        	n=n/10;
        }
        n=s;s=0;
        
	 }
	 if(n==1)
        {
     		System.out.println("Happy");
     		//braek;   	
        }
        else
        System.out.println("Not Happy");
	}
}