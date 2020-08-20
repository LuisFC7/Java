import java.util.Scanner;

public class Principal{

	public static void main(String[]args){
	
		Scanner input = new Scanner(System.in);
		int option;

		System.out.println("\n*****Vectorial Calculator****\n ");

		Vector3d choose1 = new Vector3d();
		
		System.out.println("Choose an option: \n1. Magnitude and Direction of Vector\n");
		option = input.nextInt();

		switch(option){
			
			case 1:  choose1.decision1();
				break;



		}



	}




}
