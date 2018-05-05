import java.util.Scanner;

class IndexInput
{

	/*boolean isPrime(int n)
	{
		int c = 0;
		for(int i = 2; i<=n; i++)
		{
			if(n%i == 0)
		    c++;
		}
		    if(c == 2)
			      return true;
		       else
			      return false;
	 }*/
	public static void main(String args[])
	{
	    int i,j,sum=0,k,digitAdd=0,flag=0,total;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter rows");
	    int rows = sc.nextInt();

	    System.out.println("Enter colomns");
	    int coloms = sc.nextInt();

	    int a[][] = new int[rows][coloms];

        //read elements
	    for(i = 0; i < rows; i++)
	    {
	       	    for(j = 0; j < coloms; j++)
	       	    {
	       	       a[i][j] = sc.nextInt();
                }

         }

         for(i = 0; i < rows; i++)
	     {
	       	    for(j = 0; j < coloms; j++)
	       	    {
	       	       //flag =0;
	       	       sum = a[i][j] + a[j][i];
                  // int sum[] = new int [n*n];
	       	       for(k = 2;k<=sum/2;k++)
	       	       {
	       	       	  if(sum%k==0)
	       	       	  {
	       	       	  	flag = 1;
	       	       	  	break;
	       	       	  }
	       	       	  else {continue;}

	       	       }

	       	       if(flag==0)
	       	       {
	       	       	  total=0;

                      while(sum>0)
                      {
                      	digitAdd = sum% 10;
                      	sum =sum/10;
                      	total = total + digitAdd;

                      }

                      if(total%2==1)
                      {
                      	System.out.println("Prime array is: " +a[i][j]+""+a[j][i]+"addition of digits"+total);
                      }
	       	        }

                   }


	       	    }


	     }


}