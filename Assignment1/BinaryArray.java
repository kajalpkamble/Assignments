import java.util.Scanner;

class BinaryArray
{
	
	    public static void main (String[] args) 
	    {

	      Scanner sc = new Scanner(System.in);

	      System.out.println("Enter size");
          
	      int n = sc.nextInt();

	      int i,j;

          System.out.println ("enter 1st binary Array");

	      int Bin1[][] = new int[n][n];

          for(i = 0; i < n; i++)
          {
              for(j = 0; j < n; j++)
              {

                  Bin1[i][j] = sc.nextInt();
               }
               System.out.println(Bin1[i][j]);
          }

          System.out.println ("enter 2nd binary Array");

	      int Bin2[][] = new int[n][n];
          for(i = 0; i < n; i++)
          {
              for(j = 0; j < n; j++)
              {

                 Bin2[i][j] = sc.nextInt();
               }
                 System.out.println(Bin2[i][j]);
          }

	    }

	   
	
}