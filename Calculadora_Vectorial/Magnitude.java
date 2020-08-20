import java.util.Scanner;

public class Magnitude{
	
	double x , y, z, mag, dir1, dir2;
	
	public void  Magnitude(double x, double y){
		
		mag = Math.sqrt((x*x) + (y*y));
		dir1 = x / mag;
		dir2 = y / mag;

		System.out.println("\nMagnitude = "+mag);
		System.out.println("\nDirection = "+dir1);


	}


}
