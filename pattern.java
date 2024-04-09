class Pattern
{
	public static void main(String ar[])
	{
    int i,j;
    int a,b;
    	for(i=1;i<=10;i++){
			a=0;
			b=0;
		for(j=1;j<=10;j++){
			if(j<=5)
				a=j;
			else{
				if(i+j>=11&&i-j<=0){
					a=++b;
			}}
			if(j==1||i+j==11||j==10||i-j==0){
		    System.out.printf("%c ",(a+64));}
			else{
				System.out.print(" ");
		}}System.out.println();
		}}}
		
		/*
		A           A
		A B       A B
		A  C     A  C
		A   D   A   D
		A    E A    E
		A    E A    E
		A   D   A   D
		A  C     A  C
		A B       A B
		A           A
		
		*/