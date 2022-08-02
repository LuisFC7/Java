import java.util.Scanner;

public class Principal{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int choose;

	System.out.println("\nLinear Algebra");
	System.out.println("Choose an option");
	System.out.println("1. Equations 2x2");
	choose=input.nextInt();
	//Aqui se definen los objetos para construccion de app
	//Ecuaciones lineales con 2 incognitas
	Datos opt1 = new Datos();
	switch(choose){
		case 1:{
			       opt1.Equation1();
			       break;
		}
		default:{

		}
	
	}



	}




}
