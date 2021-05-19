import java.util.*;
class DrawingBook{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0,m=0;
 		System.out.println("Enter total no. of pages");
 		int n=sc.nextInt();
 		System.out.println("Enter page to be searched");
 		int p=sc.nextInt();
 		if( p==1 || (p==n || p==n-1) ){
 				System.out.println(0);
 				System.exit(0);
 				}

 		k=p-2;
 			//System.out.println(k);
 		k=k/2;
 	    System.out.println(k+1);
        int h=n-2;
        m=h-p;
 				//System.out.println(m);
  	    m=m/2;
 		
 		System.out.println(m+2);
 		//System.out.println(countF +" "+countB);
 		if(k+1 < m+2)
 			System.out.println(k+1);
 		else if(k+1 > m+2)
 			System.out.println(m+2);
 		if(k+1 == m+2)
 			System.out.println(k+1);
	}
}