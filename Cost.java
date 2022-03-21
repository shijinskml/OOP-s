import java.util.Scanner;
class Product
{
	String pcode;
	String pname;
	int price;
	void read(String x,String y,int z)
	{
		pcode=x;
		pname=y;
		price=z;
	}
}

class Cost
{
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.read("PQR123","iphone",10000);
		p2.read("PQR124","samsung",5000);
		p3.read("PQR125","oppo",2500);
		if((p1.price<p2.price) && (p1.price<p3.price))
			System.out.println("the lowest price productr is:  "+p1.pname);
		else if((p2.price<p1.price)&&(p2.price<p3.price))
			System.out.println("the lowest price product is:  "+p2.pname);
		else
			System.out.println("the lowest price prodoct is:  "+p3.pname);
		
	}
}



/*Scanner s = new Scanner(System.in)

System.out.println("Enter pname");
String pname = s.nextLine();
System.out.println("Enter pcode");
int pcode = Integer.parseInt(s.nextLine());*/
