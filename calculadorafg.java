
package calculadorafg;

   import java.util.Scanner;

public class CalculadoraFG 
{
    public static void main(String[] args)
    {
        //Calculadora de formula general,
        double a,b,c;
        double aux,aux2;
      Scanner entradad = new Scanner(System.in);
      System.out.println("*****Secon Grade Equation Calculator's*****");
      System.out.println("Please enter data A: ");
      a = entradad.nextDouble();
      System.out.println("Please enter data B: ");
      b = entradad.nextDouble();
      System.out.println("Please enter data C: ");  
      c = entradad.nextDouble();
      
      //How to do a casting.
      //aux=(float)b;
      
      aux = (-b + Math.sqrt(b*b - 4*a*c)/(2*a));
      aux2 = (-b - Math.sqrt(b*b - 4*a*c)/(2*a));
      
      System.out.println("X1: "+aux);
      System.out.println("X2: "+aux2);
  
     
    }
    
}
