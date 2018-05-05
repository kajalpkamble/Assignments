import java.util.Scanner;

class AndOperator
{

 public static void main(String args[])
  {
      int i,j,andOperator=0;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter rows");
      int rows = sc.nextInt();

      System.out.println("Enter colomns");
      int coloms = sc.nextInt();
      
      int a[][] = new int[rows][coloms];
      int b[][] = new int[rows][coloms];

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
                 b[i][j] = sc.nextInt();
              }

      }
         for(i = 0; i < rows; i++)
       {
              for(j = 0; j < coloms; j++)
              {
                 
                 andOperator = a[i][j] & b[j][i]; 
                   
              }
             
                    System.out.println("Final Array: "+a[i][j]+""+b[i][j]+""+andOperator);

       }

	   
	}
}