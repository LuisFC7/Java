import java.util.Scanner;
public class Datos {
    
    public static void main(String [] args){
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*****Basic Calculator*****");
        System.out.println("Enter number");
        num1 = entrada.nextInt();
        System.out.println("Enter number: ");
        num2 = entrada.nextInt();
        
        Operation sum = new Operation();
        sum.Operation1(num1, num2);
    }
    
}
