import java.util.*;
class sahil{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int keboard[]=new int[100];
		int usb[]=new int[100];
		int a[]=new int [100];
		int n=keboard.length;
		int m=usb.length;
		System.out.println("Enter rupees");
		int s=sc.nextInt();
		System.out.println("Enter no.of keyboards");
		n=sc.nextInt();
		System.out.println("enter no of usbs");
		m=sc.nextInt();
		System.out.println("Enter brand of keboards");
		for (int i=0; i<n;i++ ) {
			keboard[i]=sc.nextInt();
		}
		System.out.println("Enter usb brands");
		for (int i=0;i<m ;i++ ) {
			usb[i]=sc.nextInt(); 	
		}
		int max=-1;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		if(keboard[i]+usb[j]<=s && keboard[i]+usb[j]>max)
        			max=keboard[i]+usb[j];        		
        	}
        }
        System.out.println(max);
       
	}
}