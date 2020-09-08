import java.util.Scanner;
class Hour{
	Scanner input = new Scanner(System.in);

	public void Hour(int h, int m, int s){
		int hour = h;
		int minute = m;
		int sec = s;

		//I'm trying to anidade the method
		option3.savenewdata(hour,minute,sec);

	}

	public void advance(int h, int m, int s){
		int more,more2,more3;
		System.out.println("*****Advance hour*****\n Hours to advance: \n");
		more = input.nextInt();
		System.out.prinln("Minutes to advance: \n");
		more2 = input.nextInt();
		System.out.println("Secs to advance: \n");
		more3 = input.nextInt();
		int newer2 = m+more2;
		int newer = h+more;
		int newer3 = s+more3;
		//I´m looking for a correctly way that works this
		option1.savenewdata(newer,newer2,newer3);

	}
	
	public void savenewdata(int n, int n1, int n2){
		
		int nu = n;
		int ndo = n1;
		int ntr = n2;

		option2.restart(nu,ndo,ntr);

	}
	public void print(int h,int m, int s){

		System.out


	}



}
