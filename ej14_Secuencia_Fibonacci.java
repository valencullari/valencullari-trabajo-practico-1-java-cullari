package ej14;
import java.util.Scanner;

public class Secuencia_Fibonacci {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		int num;
		System.out.print("Ingrese un límite para ejecutar la secuencia Fibonacci: ");
		num=scanner.nextInt();

		int a=0, b=1;
		System.out.print("\n" + a);

		while (b<=num)//corrobora que b(numero anterior) sea menor que el numero ingresado
		{
			System.out.print(", " + b);//imprime la suma de los dos numeros anteriores de la lista (SecuenciaFibonacci)
			int temp = b;
			b = a + b;
			a = temp;
		}
		scanner.close();
	}
}
