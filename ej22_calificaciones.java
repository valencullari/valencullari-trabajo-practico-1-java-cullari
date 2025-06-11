package ej22;
import java.util.Scanner;

public class calificaciones {

	public static void main(String[] args) {
		
		double [] num = new double [5];
		double prom=0;
		
		Scanner scanner = new Scanner(System.in); 
		
		for(int i=0;i<5;i++)
		{
			System.out.print("ingrese la calificacion n"+(i+1)+":\t");
			num[i]= scanner.nextDouble();
		}
		for(double cal : num)//for each que recorre todos los numeros ingresados por el usuario y se los suma a una variable para calcular el promedio
		{
			prom+=cal;
		}
		prom/=5;
		System.out.print("el promedio de esas calificaciones es:\t"+prom);
		scanner.close();
	}

}
