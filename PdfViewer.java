import java.util.*;

class PdfViewer{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[26];
		System.out.println("Enter data");
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter string");
		//flush();
		String s=sc.nextLine();
		int k=PdfViewer.getHeight(a,s);
		System.out.println(s);
		
	}
	public static int getHeight(int a[], String s)
	{
		int width=s.length();
		int max=0;
		for (int i=0;i<width ;i++ ) {
				if(max<a[(int)s.charAt(i)-97])
					max=a[(int)s.charAt(i)-97];
			}	
			return (width*max);

	}  
}
