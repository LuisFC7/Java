import java.util.Scanner;

public class Principal{

	public static void main(String[]args){
	
		double c1, c2 ,c3;
		Scanner input = new Scanner(System.in);
		double n;
		System.out.println("\n*****Vectors*****\n ");

		Vector3d vector1 = new Vector3d();
		Vector3d vector2 = new Vector3d();

		System.out.println("Enter coordinates for vector 1\n");
		c1 = input.nextDouble();
		c2 = input.nextDouble();
		c3 = input.nextDouble();
		n = vector1.getVector(c1,c2,c3);
		System.out.println("\n Magnitude = "+n);




	}




}
