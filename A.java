import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
class A
{
// 
	boolean isPrime(int n) 
	{
		int c = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
				c++;
		}
		if(c == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[])throws IOException
	{
		A ob = new A();

		
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows : ");
		int rows=sc.nextInt();

		System.out.print("Enter the number of columns : ");
		int columns=sc.nextInt();

		int A[][]=new int[rows][columns];

		int B[] = new int [rows*columns];

		int i = 0, j;
		int k = 1; 

		while(i < rows*columns)
		{
			if(ob.isPrime(k)==true)
			{
				B[i] = k;
				i++;
			}
			k++;
		}

		// for 2D Array.
		int x = 0;
		for(i=0; i<rows; i++)
		{
			for(j=0; j<columns; j++)
			{
				A[i][j] = B[x];
				x++;
			}
		}

		// printing the result in 2D Array.
		System.out.println("The Final Array is : ");
		for(i=0; i<rows; i++)
		{
			for(j=0; j<columns; j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
        }