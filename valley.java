class Valley{
	public static void main(String[] args) {
		String s="DUDUDDDUU";
		int sealevel=0,valley=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='U')
				sealevel++;
			else{

				if(sealevel==0)
					valley++;
				sealevel--;
			}
		}
		System.out.println(valley);
	}
}