import java.util.*;
class DiagonalDifference{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[100][100];
		int row,colomn,rdiagonal=0,leftdiagonal=0;
		System.out.println("enter rows and colomns");
		row=sc.nextInt();
		colomn=sc.nextInt();
		System.out.println("loop for input");
		if(row==colomn)
		{
			for(int i=0;i<row;i++)
				 {
				 	for(int j=0;j<colomn;j++)
				 	  a[i][j]=sc.nextInt(); 	
				 }

		}
		System.out.println("loop for rd");
		   for(int i=0;i<row;i++)
            {	
               for(int j=0;j<colomn;j++)
                {	               
	                 if(i==j)
    			 		rdiagonal=rdiagonal+a[i][j];
				 	
                 }
               } 
           System.out.println(rdiagonal);    
        System.out.println("loop for ld"); 
        int k=row;         
           for(int i=0;i<row;i++)
            {	
            	k=k-1;
               for(int j=0;j<colomn;j++)
                {
				  if(j==k)
				 	 {
				 		leftdiagonal=leftdiagonal+a[i][k];
				 		
                      }
                 }
               }   
        System.out.println(leftdiagonal);          
		System.out.println(Math.abs(rdiagonal-leftdiagonal));
	}
}