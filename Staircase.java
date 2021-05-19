import java.util.*;
class Staircase{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int k=0;
		 for(int i=0;i<n;i++)
		 	 {
		 	 	//for(int j=n-1;j>=i;j--)
		 	 	//	System.out.print(" ");
				for(k=0;k<=i;k++)
				  System.out.print(k);
				if(k>i)					
			   System.out.println();	 
		 	 }

	}
}