import java.util.*;
class Kangroo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter k1 initial position");
 		int x1=sc.nextInt();
 		System.out.println("Enter k1 initial jump");
 		int v1=sc.nextInt();
 		System.out.println("Enter k2 initial position");
 		int x2=sc.nextInt();
 		System.out.println("Enter k2 initial jump");
 		int v2=sc.nextInt();
 		if((v2>v1 && x1<x2) || (v1>v2 && x1>x2))
 			System.out.println("No");
 		else
 		{
 			//int i=0;
 			while(true)
 			{
 				x1=x1+v1;
 				//System.out.println(l1);
 				x2=x2+v2;
 				//System.out.println(l2);
 				if(x1==x2)
 				{
 					System.out.println("Yes");
 					break;
 				}
 				//i++;
 			}
 		}
	}
}