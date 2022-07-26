import java.util.Scanner;
import java.util.Arrays;

public class Equations{

	Scanner input = new Scanner(System.in);
	public void Calculo(double e1[], double e2[]){
		//Primer Caso
		//dividir entre x la primera ecuacion
		//multiplicar en aux por el valor contrario de x2 y sumarlo
		//
		
		double [] aux1=new double[3];
		double [] aux2=new double[3];
		for(int i=0; i<3;i++){
			aux2[i]=((e1[i]/e1[0])*(-e2[0]))+e2[i];
			//System.out.println(aux2[i]);
			aux1[i]=(e1[i]/e1[0]);
			//System.out.println(aux1[i]);
			aux2[i]=aux2[i]/(aux2[1]);
			System.out.println(aux2[i]);

		}
		
	}

	public void Identificador(double e1[], double e2[]){
		//primero identificar si tiene infinidad de soluciones
		double indice=0;
		if(e2[0]>e1[0]){
			indice=e2[0]/e1[0];
			for(int i=0; i<3; i++){
				e1[i]=e1[i]*indice;
				System.out.println(e1[i]);
			}
		}else{
			indice=e1[0]/e2[0];
			for(int i=0; i<3; i++){
				e2[i]=e2[i]*indice;
				System.out.println(e2[i]);
			}

		}

		if(Arrays.equals(e1,e2)){
			System.out.println("Infinidad de soluciones");
		}else{
			//aqui llamar otra funcin
		}
			
		


	}
	
}
