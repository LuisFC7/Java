import java.util.Scanner;
class Principal{

	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	Hour introduce = new Hour();
	int hour,minute,seg,option;
	System.out.println("\n*****Clock*****\n");
	System.out.println("Enter Hour exactly:\n ");
	hour = input.nextInt();
	System.out.println("Enter minute: \n");
	minute = input.nextInt();
	System.out.println("Enter sec: \n");
	seg = input.nextInt();
	introduce.Hour(hour,minute,seg);
	System.out.println("1. Advance\n 2. Restart Hour\n 3. Show Hour");
	option = input.nextInt();
	switch(option){
		case 1: introduce.advance();
			break;
		case 2: introduce.restart();
			break;
		case 3: introduce.print();
			break;


	}

	}


}
