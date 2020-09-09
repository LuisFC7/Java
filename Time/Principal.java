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
	}
	

}
