import java.util.Scanner;

class Datos{
	
	Scanner input=new Scanner(System.in);
	Equations global= new Equations();

	public void Equation1(){
		//Arrays para datos de ecuaciones.
		double [] equation1=new double[3];
		double [] equation2=new double[3];
		int band=0;
		//Instanciacion de objeto clase Equations
		Equations in = new Equations();

		System.out.println("Ingrese la ecuación 1: ");
		for(int i=0; i<3; i++){
			equation1[i]=input.nextInt();
			band++;
			if(band==3){
				System.out.println("Ingrese la ecuación 2: ");
				for(int j=0; j<3; j++){
					equation2[j]=input.nextInt();
				}

			}
	
		}
		
		in.Identificador(equation1,equation2);
	}

	public void Gaussnxn(){
		int a,b;
		System.out.println("Ingrese dimensión de la matriz: ");
		a=input.nextInt();
		System.out.println("");
		b=input.nextInt();
		//creación de objeto para llamarlo asi mismo
		Datos re=new Datos();
		if(a==b || a>b){
			System.out.println("La dimensión de la matriz no puede ser cuadrada \n numero de columnas debe ser mayor a filas");
			re.Gaussnxn();
		}else{
			
			double[][] matriz=new double[a][b];
			for(int i=0; i<a; i++){
				for(int j=0; j<b; j++){
					System.out.println("Ingrese el valor: ");
					matriz[i][j]=input.nextDouble();
				}
			}
			global.CalculoGauss(matriz,a,b);

		}

	}


}
