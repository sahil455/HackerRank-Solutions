import java.util.*;
class Comparsion{
	static int bob,alice;
	public static void main(String[] args) {
		//static int bob,alice;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[2];
		
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			if(a[i]>b[i]){
				alice++;
				//System.out.println("alice" +alice);
			}
			else if(a[i]<b[i]){
				bob++;
				//System.out.println("bob" +bob);
			}
			else{}
		}
		c[1]=bob;
		//System.out.println("bob" +bob);
		c[0]=alice;
		//System.out.println("alice" +alice);
		for (int i=0; i<2;i++ ) {
			System.out.print(" "+c[i]);
		}
	}
}