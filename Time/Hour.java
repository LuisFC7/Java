import java.util.Scanner;
class Hour{
	Scanner input = new Scanner(System.in);
	//declaration of a new object to give data
	Hour omenu = new Hour();
	Hour omenu1 = new Hour();
	Hour omenu2 = new Hour();
	Hour omenu3 = new Hour();
	Hour omenu4 = new Hour();
	Hour omenu5 = new Hour();
	Hour omenu6 = new Hour();
	//constructor to print hour
	public void Hour(int h, int m, int s){
		int hour = h;
		int minute = m;
		int sec = s;
		int option;
		int band =1;
		System.out.println("1. Advance Hour\n 2.Restart\n 3.Show Current Hour\n");
		option = input.nextInt();

		switch(option){
			case 1: omenu.advance(hour,minute,sec);
				break;
			case 2:	omenu1.restart(hour,minute,sec); 
				break;
			case 3: omenu2.Hour(hour,minute,sec,band);
				break;
		
		}


		//I'm trying to anidade the method

	}

	public void advance(int h, int m, int s){
		int more,more2,more3;
		System.out.println("*****Advance hour*****\n Hours to advance: \n");
		more = input.nextInt();
		System.out.println("Minutes to advance: \n");
		more2 = input.nextInt();
		System.out.println("Secs to advance: \n");
		more3 = input.nextInt();
		int newer2 = m+more2;
		int newer = h+more;
		int newer3 = s+more3;
		//I'm calling a principal constructor to get again main options
		omenu3.Hour(newer,newer2,newer3);
		omenu4.datasaver(h,m,s,newer,newer2,newer3);//IDK if is the correct way to do it

	}

	//now another constructor to print
	public void Hour(int h, int m, int s,int band){
		
		int ho = h;
		int min = m;
		int se = s;
		System.out.println(" " +ho+":"+min+":"+se);


	}

	public void ghost(int h, int m, int s,int n, int ne, int ne1){
		int no = h-n;
		int mo = m-ne;
		int so = s-ne1;
		omenu5.restart(no,mo,so);
	}
	public void datasaver(int h, int m, int s,int n,int n2,int n3){
		int hr = h;
		int mi = m;
		int sg = s;
		int cur = n;
		int cu1 = n2;
		int cu2 = n3;

		omenu6.ghost(hr,mi,sg,cur,cu1,cu2);

	}
	public void restart(int h, int m, int s){
		int hour = h;
		int minute = m;
		int sec = s;
	}


}
