package ej3;
import java.util.Scanner;

public class numpedidoprimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //funcion para scanear datos ingresados por el usuario
		int num;
		int contador=0;
		do {
			contador=0;
			do {
				
				System.out.print("ingrese un numero mayor a 100 y primo:\t");
				num = scanner.nextInt();//ingreso de dato int 
			}while(num<100);//corrobora que el numero ingresado sea mayor a 100 si no vuelve a arrancar
			for(int i=1;i<=num;i++)// ciclo for para saber si es primo
			{
				if(num%i==0)
				{
					contador++;
				}
			}
			
		}while(contador!=2);//corrobora que sea primo si no vuelve a empezar
		System.out.print("\nNumero ingresado correctamente\nSaliendo del programa...");
	}
}
