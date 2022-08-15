import java.util.Scanner;
import java.util.Arrays;

public class Equations{

	Scanner input = new Scanner(System.in);
	public void Calculo(double e1[], double e2[]){
		//Primer Caso
		//dividir entre x la primera ecuacion
		//multiplicar en aux por el valor contrario de x2 y sumarlo
		double [] aux1=new double[3];
		double [] aux2=new double[3];
		double indice1=0;
		int band=0;
		//verificar si la pos 1 de e1 vale 1 si no tomarlo como pivote
		if(e1[0]>0){
			indice1=e1[0];
			for(int i=0; i<3; i++)
				e1[i]=e1[i]/indice1;
		}

		for(int i=0; i<3;i++)
			aux2[i]=((e1[i]/e1[0])*(-e2[0]))+e2[i];
		
		indice1=aux2[1];
		for(int i=0; i<3; i++)
			aux2[i]=aux2[i]/indice1;
		
		indice1=(-1)*e1[1];	
		for(int i=0; i<3; i++){
			e2[i]=aux2[i]*indice1;
			e1[i]=e1[i]+e2[i];
		}
			
		System.out.println("X1: "+e1[2]+"\nX2: "+aux2[2]);
	}
		
	
	public void Identificador(double e1[], double e2[]){
		//primero identificar si tiene infinidad de soluciones
		double indice=0;
		double [] ar1=new double[3];
		double [] ar2=new double[3];
		ar1=e1;
		ar2=e2;
		if(e2[0]>e1[0]){
			indice=e2[0]/e1[0];
			for(int i=0; i<3; i++){
				e1[i]=e1[i]*indice;
				//System.out.println(e1[i]);
			}
		}else{
			indice=e1[0]/e2[0];
			for(int i=0; i<3; i++){
				e2[i]=e2[i]*indice;
				//System.out.println(e2[i]);
			}

		}

		if(Arrays.equals(e1,e2)){
			System.out.println("Infinidad de soluciones");
		}else if(e1[0]==e2[0] && e1[1]==e2[1] && e1[2]!=e2[2]){
			System.out.println("Sistema sin solucion");
		}else{
			Calculo(ar1,ar2);
		}	
			
	}

	//OPERACIONES PARA GAUSS JORDAN
	
	public void Imprimir(double matriz[][], int a, int b){

		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				System.out.println(matriz[i][j]+"\t");
			}
			System.out.println();
		}

	}
	//esta funcion sera recursiva
	public void OperacionesGauss(double matriz[][], int a, int b, int c, int idi){
		double id;
		int id2=idi;
		double []arr=new double[b];
		//Donde c representa el numero de filas
		if(c<a){
			for(int i=0; i<1; i++){
				for(int j=0; j<b; j++){
					id=matriz[i+c][0];
					arr[j]=matriz[i][j];
					matriz[i][j]=matriz[i][j]*(-id);
				}
			}
			for(int i=0; i<1; i++){
				for(int j=0; j<b; j++){
					matriz[i+c][j]=matriz[i][j]+matriz[i+c][j];
					matriz[i][j]=arr[j];
				}

			}
			c++;
			id2=0;
			OperacionesGauss(matriz,a,b,c,id2);

		}else{
			id2++;

			double iden=matriz[c-a+1][id2];
			//aqui se hace la operacion de llevar a uno el pivote de cada renglon
			for(int i=c-a+1; i<c-a+2; i++){
				for(int j=1; j<b; j++){

					System.out.println("iden: "+iden);
					matriz[i][j]=matriz[i][j]/iden;
					System.out.println("i :"+i);
				}
			}
			Imprimir(matriz,a,b);
				
		}
			
	}
	public void CalculoGauss(double matriz[][], int a, int b){
		double id1;
		int in=0;
		double id2=1;
		int c=1;

		if(matriz[0][0]>1){
			id1=matriz[0][0];
			for(int i=0; i<1; i++){
				for(int j=0; j<b; j++){
					id2=matriz[i+1][0];
					matriz[i][j]=(matriz[i][j]/id1);
				}
			}
			OperacionesGauss(matriz,a,b,c,in);
		}

	}
	
}
