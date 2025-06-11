package ej4;
import java.util.Scanner;
public class sumaNumParImpar {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum=0;
		
		do {
			System.out.print("ingrese un numero entero positivo:\t");
			num = scanner.nextInt();
		}while(num<0);//corrobora que sea un numero positivo 
		for(int i=0;i<=num;i+=2)//suma los numeros pares desde 0 hasta el numero ingresado 
		{
			sum+=i;
		}
		System.out.println("la suma de los numeros pares es :"+sum);//muestra resultado numeros pares
		sum=0;
		for(int i=1;i<=num;i+=2)//suma los numeros impares desde 0 hasta el numero ingresado 
		{
			sum+=i;
		}
		System.out.print("la suma de los numeros impares es :"+sum);//muestra resultado numeros impares

}
}
