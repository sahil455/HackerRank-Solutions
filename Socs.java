class Socs{
	public static void main(String[] args) {
	 int ar[]={1,1,3,5,33,3};
	 int pair=0,count=0;
	 for(int i=0;i<ar.length;i++)
	  {
		if(ar[i]%2==0){
	  		for(int j=i;j<ar.length;j++)
	  			{
	  				if(ar[i]==ar[j]) 
	  				count++;
	  			}
	  		if(count%2==0)
	  			pair++;
	  	count=0;
		}		
	  }	
	  System.out.println(pair);
	}
}