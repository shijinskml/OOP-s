import java.util.Scanner;
public class employee
{
int eNo;
String name;
float salary;

public void getInput()
{
	Scanner in =  new Scanner(System.in);
	System.out.println("Enter the employee id:");
	eNo = in.nextInt();
	System.out.println("Enter the employee name:");
	name = in.next();
	System.out.println("Enter the salary:");
	salary = in.nextFloat();
}

public void display()
{
System.out.println("Employee id:"+eNo);
System.out.println("Employee name:"+name);
System.out.println("Salary:"+salary);
}

public static void main(String[] args)
{
System.out.println("Enter the number of employees:");
Scanner in =  new Scanner(System.in);
int n = in.nextInt();
employee e[]= new employee[n];
for (int i=0;i<n;i++)
{
	e[i] = new employee();
	e[i].getInput();
}
System.out.println("\nEnter the employee number to search:");
int a=in.nextInt();

for(int i=0;i<n;i++)
{
	if(e[i].eNo ==a)
 	{
		int j=i+1;
		System.out.println("\nEmployee No:"+j);
		System.out.println("*************");
		e[i].display();
	}
else
	continue;
}
}

}

