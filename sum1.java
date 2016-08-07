public class Sumofdigits {
	public static void main(String[] args)
	{
		int count=0;
	  int n1=12345;
	  int n=n1;
	  int a1;
	  int sum2=0;
	 int x=0;
	 int m=0;
	
			while(n>0)
			{
		    a1=n%10;
			System.out.println(a1);
            n=n/10;
			count++;

            }
        System.out.println(count);
	  int a[]=new int[count];
	  
	  if(n1>9)
		{
        for(int i=0;i<a.length;i++)
        {
        	 x=n1%10;
        
        	 a[i]=x;
        	System.out.println(a[i]);
        	n1=n1/10;
        	System.out.println(x);
        }
        for(int k=a.length;k>=0;k--)
        {
        	for(int l=a.length-1;l>=k;l--)
        	{
        	   m=m+a[l];
        	}
        }System.out.println(m);
        
        
		} }
