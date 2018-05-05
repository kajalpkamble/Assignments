import java.util.Scanner;

class RandomNumber
{
	public static void main(String args[])
	{

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size");
        int i,n,j,flag=0,count=0;
	    n = sc.nextInt();
	    int Random[] = new int[n];
        //count = n/k;

        System.out.println("Enter Elements");

	    for(i =0; i<n; i++)
	    {
	    	Random[i] = sc.nextInt();

	    }
	   // System.out.println("Repeated Elements");

	    for(i =0; i<n; i++)
	    {
        	    for(j =0; j<n; j++)
        	   {
        	   	   if(i!=j)
        	   	   {
                     if(Random[i]==Random[j])
                     {
                       count++;

        	    	       System.out.println("Repeated Elements: "+Random[i]);


                     }
                     else{flag=0;
        	        break;}
        	      }
        	   }


	    }

	     System.out.println("");
	     System.out.println("count is of: " +count);

	}
}