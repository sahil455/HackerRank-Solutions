import java.util.*;
class PlusMinus {

    // Complete the plusMinus function below.
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[1000];
      int n=sc.nextInt();   
      for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
      int c1=0,c2=0,c3=0;
      for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                c1++;
            else if(arr[i]<0)
                c2++;
            else
                c3++;       
        }
        double e=3/6;
           System.out.println(e);
         double f1=arr.length/c1;
        double f2=c2/arr.length;
        double f3=c3/arr.length;
        System.out.println(1/f1);
        System.out.println(f2);
        System.out.println(f3);
        
    }
   }     