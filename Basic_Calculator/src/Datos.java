import java.util.Scanner;
public class Datos {
    
    public static void main(String [] args){
        int num1, num2;
	int decision;
	int band=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*****Basic Calculator*****");

        Operation addition = new Operation();
	Operation substraction = new Operation();
	Operation times = new Operation();
	Operation division = new Operation();

	while(band==1)
	{	System.out.println("\nEnter number: ");
		num1 = entrada.nextInt();
		System.out.println("Enter number: ");
		num2 = entrada.nextInt();
		System.out.println("\n");
		System.out.println("Choose de Operation\n 1. Addition \n 2. Substraction \n 3. Times \n 4. Division \n");
	
		decision = entrada.nextInt();
	if(decision == 1){
		addition.Operation1(num1, num2);
	}else if(decision == 2){
		substraction.Operation2(num1, num2);
		}else if(decision == 3){
			times.Operation3(num1, num2);
			}else if(decision == 4){
				division.Operation4(num1, num2);
				}else{ System.out.println("Enter correctly number of operation, please");}
		System.out.println("Do you want to do another operation? \n 0 = No \n 1 = Yes\n");
		band = entrada.nextInt();
	}
    }

}
