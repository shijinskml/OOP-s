import java.util.*;    
class OverloadDemo

    {

        void area(float x)

        {

            System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");

        }

        void area(float x, float y)

        {

            System.out.println("the area of the rectangle is "+x*y+" sq units");

        }

        void area(double x)

        {

            double z = 3.14 * x * x;

            System.out.println("the area of the circle is "+z+" sq units");

        }

    }

    class Overload 

    {

         public static void main(String args[]) 

    	{
	   Scanner s=new Scanner(System.in);

    	   OverloadDemo ob = new OverloadDemo();
	 System.out.println("enter the side of square:");
	 float a=s.nextFloat();
    	   ob.area(a);
	System.out.println("enter the base and height of rectangle:");
	float b=s.nextFloat();
	float h=s.nextFloat();    	   
	ob.area(b,h);
	System.out.println("enter the radius of circle:");
	
	double r=s.nextDouble();
    	   ob.area(r);

            }

    }
