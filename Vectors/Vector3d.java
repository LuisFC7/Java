public class Vector3d{

	double x, y, z;
	double normal;
	public double getVector(double x, double y, double z){
	
		normal = Math.sqrt((x*x) + (y*y) + (z*z));

		return normal;
	
	
	}






}
