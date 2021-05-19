import java.util.*;
class AngryProfessor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter range");
		int n=sc.nextInt();
		System.out.println("enter limit");
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		String s=AngryProfessor.isAttendence(a,n,k);
		System.out.println(s);
	}
	public static String isAttendence(int a[],int n,int k)
	{
		int count=0;
		for (int i=0;i<n;i++) {
			if(a[i]<=0)
				count++;
		}
		if(count>=k)
			return "Yes";
		else
			return "No";
	}
}