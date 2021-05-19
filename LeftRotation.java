import java.util.*;
class G{
	public void leftRotation(int arr[],int n,int rotationValue)
	{
		int i=0;
		int h=i;
		while(h<rotationValue)
		{
			int temp=arr[i];
			for(int j=i+1;j<n;j++)
			{
				arr[i]=arr[j];
				i++;
			}
			arr[n-1]=temp;
			h++; i=0;
		}
		for(int k=0;k<n;k++)
			System.out.print(" "+arr[k]);
	}
}
class LeftRotation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		G g=new G();
		System.out.println("Enter range of array");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("Enter array");
		for (int i=0; i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter rotation value");
		int rotationValue=sc.nextInt();
		g.leftRotation(arr,n,rotationValue);
	}
}