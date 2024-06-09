package Random_practice;
import java.math.*;
import java.util.Scanner;

public class Root {
	// solve 2*2 linear equation

	static public void initialize() {
		Scanner SC = new Scanner(System.in);
		System.out.println("the euqation format will be ==> ");
		System.out.println("ax+by=0");
		System.out.println("cx+dy=0");

		System.out.println("Enter the value of a : ");
		int a = SC.nextInt();
		System.out.println("Enter the value of b : ");
		int b = SC.nextInt();

		System.out.println("Enter the value of c : ");
		int c = SC.nextInt();
		System.out.println("Enter the value of d : ");
		int d = SC.nextInt();

		System.out.println("1st equation is "+a+"x +"+b+"y = 5");
		System.out.println("2nd equation is "+c+"x +"+d+"y = 6");

		float determinant = ((a*d) - (b*c));
		//float det = -(determinant);
		System.out.println(determinant);
		
		float Dx = ((5*d)-(6*b));
		float Dy = ((a*6)-(c*5));

		float x = Dx/determinant;
		float y = Dy/determinant;

		System.out.println(x);
		System.out.println(y);

		
	}

	

	public static void main(String arg[]) {
		initialize();

	}
}