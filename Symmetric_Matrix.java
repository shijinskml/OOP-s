    import java.util.Scanner;

    public class Symmetric_Matrix

    {

        public static void main(String[] args) 

        {

            int p, q,flag=0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter number of rows of matrix:");

            p = s.nextInt();

            System.out.print("Enter number of columns of matrix:");

            q = s.nextInt();

                int a[][] = new int[p][q];
		if(p==q)
		{

                System.out.println("Enter all the elements of  matrix:");

                for (int i = 0; i < p; i++) 

                {

                    for (int j = 0; j < q; j++) 

                    {

                        a[i][j] = s.nextInt();

                    }

                }

                System.out.println("Matrix:");

                for (int i = 0; i < p; i++) 

                {

                    for (int j = 0; j < q; j++) 

                    {

                        System.out.print(a[i][j]+" ");

                    }

                    System.out.println("");

                }

               for(int i=0;i<p;i++)

		{

			for(int j=0;j<q;j++)

			{
				if(a[i][j]!=a[j][i])
				{
					flag=1;
					break;
				}			
			}
		}

		if(flag==1)
		System.out.println("The matrix is not symmetric");
		else
		System.out.println("The matrix is  symmetric");
		}
	else
		{
		System.out.println("The matrix is not a square matrix");
		}	
		
        }

    }
