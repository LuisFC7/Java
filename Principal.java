import java.util.Scanner;
class Compare{
	
	public void Compare(int x, int y, int z, int x1, int y1, int z1){
		int com1,com2,com3;
		String f,s,t,f1,s1,t1;
		f = x.toString();
		s = y.toString();
		t = z.toString();
		f1 = x1.toString();
		s1 = y1.toString();
		t1 = z1.toString();
		com1 = f.equals(f1);
		com2 = s.equals(s1);
		com3 = t.equals(t1);

		
	


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
