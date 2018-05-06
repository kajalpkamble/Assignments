
class BinaryArray
{

	    public static void main (String[] args)
	    {

	       int matrix[][] ={{1,1,0},
	                    {0,1,0},
	                    {0,0,1}};
	       int matrix1[][] ={{1,0,0},
	                    {0,1,0},
	                    {1,0,1}};

           //print2D(matrix,matrix1);



            System.out.println ("enter 1st binary Array");

            for(int i = 0; i < matrix.length; i++)
            {
              for(int j = 0; j < matrix[i].length; j++)
              {

                 System.out.println(matrix[i][j]);
               }

            }

            System.out.println ("enter 2nd binary Array");

            for(int i = 0; i < matrix1.length; i++)
            {
              for(int j = 0; j < matrix1[i].length; j++)
              {

                 System.out.println(matrix1[i][j]);
              }

            }
              System.out.println ("AND Operation");

              int andOperator[][] = new int[3][3];
              int orOperator[][] = new int[3][3];

              for(int i = 0; i < 3; i++)
              {
                 for(int j = 0; j < 3; j++)
                 {

                     andOperator[i][j]=matrix[i][j]&matrix1[i][j];
                      System.out.println("AND Array is: "+andOperator[i][j]);

                 }

              }

              for(int i = 0; i < 3; i++)
              {
                 for(int j = 0; j < 3; j++)
                 {
                     orOperator[i][j] =matrix[i][j]|andOperator[i][j];
                     System.out.println("OR Array is: " +orOperator[i][j]);

                 }

              }
              int m[k] = new int[];
              for(int k=0;k<9;k++)
              {
                  m[k++]=orOperator[i][j];
              }
              int dec =0,bin=1;
              for()



        }

}