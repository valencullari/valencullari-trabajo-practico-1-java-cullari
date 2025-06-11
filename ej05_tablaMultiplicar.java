package ej5;

import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num,tabla;
		do {
			System.out.print("ingrese un numero del 1 al 10:\t");
			num = scanner.nextInt();
		}while(num<1 || num>10);//corrobora que el numero sea del 1 al 10 
		for(int i=1;i<=10;i++)//ciclo para hacer la tabla de multiplicar(1 a 10) del numero ingresado por el usuario
		{
			tabla=num*i;
			System.out.print(tabla);
			System.out.print(" ");
			tabla=0;
		}

	}

}
