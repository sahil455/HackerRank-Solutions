import java.util.*;
class BirthdayCandels{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int candels[]=new int[100];
		System.out.println("Enter range");
		int n=sc.nextInt();
		System.out.println("Enter candels");
		for (int i=0; i<n;i++ ) {
		   candels[i]=sc.nextInt();
		}
		int max=0,count=0;
		max=candels[0];
		for (int i=1;i<n;i++ ) {
			if(candels[i]>max )
				max=candels[i];
		}
			for (int j=0;j<n ; j++) {
				if(max==candels[j])
					count++;
			}  		
		
	
		System.out.println(count);
	}
}