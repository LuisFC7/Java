import java.util.Scanner;
import java.text.DecimalFormat; //class to limit decimal number to print

public class Magnitude{
	
	double x , y, z, mag, dir1, dir2, dir3;
	int mainmenu;

	Scanner input = new Scanner(System.in);
	Vector3d again = new Vector3d();
	DecimalFormat limit = new DecimalFormat("#.0000");

	public void  Magnitude(double x, double y){
		
		mag = Math.sqrt((x*x) + (y*y));
		dir1 = x / mag;
		dir2 = y / mag;

		System.out.println("\nMagnitude = "+limit.format(mag));
		System.out.println("\nDirection = " + limit.format(dir1) + "i (+) " +limit.format(dir2)+ "j\n" );
		System.out.println("\nType for\n1. Magnitude and direction of vector.\n2. Main Menu\n3. Close calculator\n");
		mainmenu = input.nextInt();

		switch(mainmenu){
			
			case 1: again.decision1();
				break;
			case 2: Principal.main(null);
				break;
			case 3: System.exit(0);
				break;

		}
	
	}
	//constructor for R3
	
	public void Magnitude(double x, double y, double z){
		mag = Math.sqrt((x*x) + (y*y) +(z*z));
		dir1 = x / mag;
		dir2 = y / mag;
		dir3 = z / mag;

		System.out.println("\nMagnitude = "+limit.format(mag));
		System.out.println("\nDirection = " + limit.format(dir1) + "i (+) " + limit.format(dir1) + "j (+) " + limit.format(dir3) + "z");
		System.out.println("\nType for\n1. Magnitude and direction of vector.\n2. Main menu\n3. Close Calculator\n");
		mainmenu = input.nextInt();
		switch(mainmenu){
			case 1: again.decision1();
				break;
			case 2: Principal.main(null);
				break;
			case 3: System.exit(0);
				break;

		}

	}


}
