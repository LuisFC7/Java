import java.util.Scanner;

public class Magnitude{
	
	double x , y, z, mag, dir1, dir2, dir3;
	int mainmenu;

	Scanner input = new Scanner(System.in);
	Vector3d again = new Vector3d();

	public void  Magnitude(double x, double y){
		
		mag = Math.sqrt((x*x) + (y*y));
		dir1 = x / mag;
		dir2 = y / mag;

		System.out.println("\nMagnitude = "+mag);
		System.out.println("\nDirection = " + dir1 + "i (+) " + dir2 + "j\n" );
		System.out.println("\nType for\n1. Magnitude and direction of vector.\n2. Main Menu\n");
		mainmenu = input.nextInt();

		switch(mainmenu){
			
			case 1: again.decision1();
				break;
			case 2: Principal.main(null);
				break;

		}
	
	}
	//constructor for R3
	
	public void Magnitude(double x, double y, double z){
		mag = Math.sqrt((x*x) + (y*y) +(z*z));
		dir1 = x / mag;
		dir2 = y / mag;
		dir3 = z / mag;

		System.out.println("\nMagnitude = "+mag);
		System.out.println("\nDirection = " + dir1 + "i (+) " + dir2 + "j (+) " + dir3 + "z");
		System.out.println("\nType for\n1. Magnitude and direction of vector.\n2. Main menu\n");
		mainmenu = input.nextInt();
		switch(mainmenu){
			case 1: again.decision1();
				break;
			case 2: Principal.main(null);
				break;

		}

	}


}
