class IndexInput
{
	public static void main(String args[])
	{
	    int i,j,n,sum=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size");

	    n = sc.nextInt();
	    int a[][] = new int[n][n];

	    for(i = 0; i < n; i++)
	    {
	       	    for(j = 0; j < n; j++)
	       	    {
	       	       a[i][j] = sc.nextInt();
	       	       System.out.println(a[i][j]);
                }

         }

         for(i = 0; i < n; i++)
	     {
	       	    for(j = 0; j < n; j++)
	       	    {
	       	       int result[i][j] = a[i][j] + a[j][i];
                   sum = result[i][j];
                   sumElement();
	       	    }
	    }

	    public static void sumElement()
	    {
            for(i = 2; i <= n; i++)
            { 
               for(i = 2; i <= n; i++)

                 if(sum % 2 == 0)
                 brk;
                 if(sum==i)
                 {
                     while(sum>0)
                     {
                        c = 
                     }

                 }
            }

	    } 
	}
}