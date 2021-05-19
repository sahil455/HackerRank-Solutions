import java.util.*;
class StringInfinite{
	public static void main(String[] args) 
	{
		String s=null,last="a",a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
        a=sc.nextLine();
		int n=sc.nextInt();
		if(a =="a")
		{
		  System.out.println(n);	
		}
		else
		{
		 	int q=n/a.length();
		 	s=a;
		 	for(int i=1;i<q;i++)		
			 	  s=s.concat(a); 	
       	    s=s.concat(last);
			for(int j=0;j<s.length();j++)
				{
					char cg=s.charAt(j);
					if(cg=='a')
						count++;
				}
		System.out.println(count);
	}
}
}