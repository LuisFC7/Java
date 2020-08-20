import java.util.Scanner;
public class Vector3d{

	double c1,c2,c3;
	Scanner input = new Scanner(System.in);
//	Magnitude option1 = new Magnitude();

	public void decision1(){
		
		int option;
		System.out.println("\nDimension of vector: \n1. R2\n2.R3\n");
		option = input.nextInt();

		Magnitude option1 = new Magnitude();
		switch(option){
			case 1: System.out.println("\nEnter coordinates: ");
				c1 = input.nextDouble();
				c2 = input.nextDouble();
				option1.Magnitude(c1, c2);

		}

	
	
	}






}
