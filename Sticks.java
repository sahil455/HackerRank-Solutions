import java.util.*;
class Sticks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter range");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for (int i=0; i<n; i++ ) 
			a[i]=sc.nextInt();
	   Sticks.cutTheSticks(a,n);
	}
	public static void cutTheSticks(int a[],int n)
	{
		int sticks[]=new int[n]; 
        int count=0,k=0;
        sticks[k]=n; k++;
        int m=n;
        int f=0;
        int min;
        while(m>1)
         { 
            min=a[f];
            if(min!=0){
            for(int i=f+1;i<n;i++)
             {
                if(a[i]<min && a[i]!=0)
                  min=a[i];
             }
           }
           else{
           	min=a[f++];
           	for(int i=f+1;i<n;i++)
             {
                if(a[i]<min && a[i]!=0)
                  min=a[i];
             }
           
           }
 
           for(int i=0;i<n;i++){
               	if(a[i]!=0){
                	a[i]=a[i]-min;
                		if(a[i]!=0)
                    		count++;     
           	 	}
           }
           sticks[k]=count;
           k++;
           m=count; 
           count=0;
        }
	  for(int i=0;i<k;i++)
	  	System.out.print(" "+sticks[i]);
    }
 }  