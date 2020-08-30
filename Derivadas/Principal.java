//this programa is able to solve polinomial derivates by now
import java.util.Scanner;
public class Principal{

	public static void main(String []args){

	Scanner input = new Scanner(System.in);
	Polinomial option1 = new Polinomial();
	int kind,cnt,exp;
	System.out.println("\nDerivate's Calculator\n Please enter option\n");
	System.out.println("1. Polinonial Derivate");
	kind = input.nextInt();

	switch(kind){
		case 1: System.out.println("Enter constant:\n ");
			cnt = input.nextInt();
			System.out.println("Enter exponent:\n ");
			exp = input.nextInt();
			option1.Polinomial(cnt, exp);
		break;

	}


	}





}
