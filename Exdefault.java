class Perimeter
{
	int length;
	int breadth;
	Perimeter()
	{
		length=0;
		breadth=0;
	}
	Perimeter(int x,int y)
	{
		length=x;
		breadth=y;
	}
 	void cal_perimeter()
	{
		int peri;
		peri=2*(length+breadth);
		System.out.println("\nThe perimeter of the rectangle is:"+peri);
	}
}
class Exdefault
{
	public static void main(String args[])
	{
		Perimeter p1=new Perimeter();
		Perimeter p2=new Perimeter(5,10);
		p1.cal_perimeter();
		p2.cal_perimeter();
	}
}
