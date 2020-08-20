import java.util.Scanner;

public class Magnitude{
	
	double x , y, z, mag, dir1, dir2;
	
	public void  Magnitude(double x, double y){
		
		DecimalFormat limit = new DecimalFormat("#.0000");
		mag = Math.sqrt((x*x) + (y*y));
		dir1 = x / mag;
		dir2 = y / mag;

		System.out.println( limit.format(mag));
		System.out.println("\nDirection = " + dir1 " );
	


	}


}
