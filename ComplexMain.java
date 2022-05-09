import java.util.*;
class Complex {
    double real, img;

    // constructor to initialise complex number
    Complex(double r, double i) {
        real = r;
        img = i;
    }

    // function to add to complex numbers
    Complex addComp(Complex C1, Complex C2) {
	Complex ans = new Complex(0.0, 0.0);
        //Complex sum = new Complex(0, 0);
        ans.real = C1.real + C2.real;
        ans.img = C1.img + C2.img;
        return ans;
    }
}

class ComplexMain {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        // create 3 complex numbers using objects of Complex class
        Complex C1 = new Complex(0.0, 0.0);
        Complex C2 = new Complex(0.0, 0.0);
        Complex C3 = new Complex(0.0, 0.0);

        // print two complex numbers
        System.out.println("enter the first complex number:\nreal:");
	C1.real=s.nextDouble();
	System.out.println("imaginary:");
	C1.img=s.nextDouble();
        System.out.println("Enter the second complex number:\n real:");
	C2.real=s.nextDouble();
	System.out.println("imaginary:");
	C2.img=s.nextDouble();

        // add 2 complex numbers and display it
        Complex answer= C3.addComp(C1, C2);
        System.out.println("Sum of complex numbers : " + answer.real + " + " + answer.img + "i");
    }
}

	

