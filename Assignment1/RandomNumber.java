import java.util.Scanner;

class RandomNumber
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size");
        int i,n,flag=0,count=0;
	    n = sc.nextInt();
	    int Random[] = new int[n];

        System.out.println("Enter Elements");

	    for(i =0; i<n; i++)
	    {
	    	Random[i] = sc.nextInt();

	    }
	   
	    for(i =0; i<n; i++)
	    {
        	    for(j =0; j<n; j++)
        	   {
                     if(Random[i]==Random[j])
                     {
        	    	System.out.println(Random[i]);

                     }
                     else{flag=0;
        	        break;}
        	   }
        	    if(flag==1)
        	    {
        	    	count++;

        	    }
      	    	*/
	    }
	     System.out.println("");
	     System.out.println("count is of  5 : " +count);



	    /*if((n/k)==count)
	    {
	       System.out.println(x[i]);

	    }*/
	    /*int x[] = {5,3,5,6,2,1};
         
       	int k = 3,i;
	    System.out.println("Enter Elements in array");
	    //take elements 
	    for(i =0; i< x.lenth; i++)
	    {
	    	System.out.println(x[i]);

	    }

	    if(n/k)
	    {
           
	    }*/


	}
}