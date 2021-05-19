import java.util.*;
class CircularRightRotation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//G g=new G();
		System.out.println("Enter range of array");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("Enter array");
		for (int i=0; i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter rotation value");
		int rotationValue=sc.nextInt();
		CircularRightRotation.circularRotation(arr,n,rotationValue);
	}
	public static void circularRotation(int arr[],int n,int rotationValue)
	{
		int i=0;
		int h=i;
		int m=n;
		while(h<rotationValue)
		{
			int temp=arr[n-1];
			for(int j=n-2;j>=i;j--)
			{
				arr[n-1]=arr[j];
				n--;
			}

			arr[i]=temp;
			h++;
			n=m;
		}
		for(int k=0;k<n;k++)
			System.out.print(" "+arr[k]);
	}
}