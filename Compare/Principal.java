//this program compare two vectors using toString and equals method
import java.util.Scanner;
class Compare{
	int x,y,z,x1,y1,z1;
		
	public void Compare(int x, int y, int z, int x1, int y1, int z1){
		boolean com1,com2,com3;
		String f,s,t,f1,s1,t1;
		//now we have to convert integer to String
		f = Integer.toString(x);
		s = Integer.toString(y);
		t = Integer.toString(z);
		f1 = Integer.toString(x1);
		s1 = Integer.toString(y1);
		t1 = Integer.toString(z1);
		com1 = f.equals(f1);
		com2 = s.equals(s1);
		com3 = t.equals(t1);

		if(com1 && com2 && com3 == true)
		{
			System.out.println("\nVectors are equal\n");
		}else{
			System.out.println("\nVectors are not equal\n");
		
		}

	}
}
class Principal{

	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	int x,y,z,x1,y1,z1;
	Compare vector1 = new Compare();
	System.out.println("\n*****Comparative Program*****\n");
	System.out.println("Enter first vector in R3: \n");
	x = input.nextInt();
	y = input.nextInt();
	z = input.nextInt();
	System.out.println("Enter second vector in R3: \n");
	x1 = input.nextInt();
	y1 = input.nextInt();
	z1 = input.nextInt();
	
	vector1.Compare(x,y,z,x1,y1,z1);

	}

}
