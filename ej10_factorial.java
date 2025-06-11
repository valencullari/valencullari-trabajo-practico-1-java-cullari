package ej10;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int num,fact=1;
		do 
		{
		
			System.out.println("ingrese un numero no negativo:\t");
			num=scanner.nextInt();
			
		}while(num<0);//corrobora que el numero se positivo si no vuelve a pedir 
		for(int i=1;i<=num;i++)//hace la cuenta del factorial del numero 
		{
			fact*=i;
		}
		System.out.println("el factorial de "+num+" es:\t"+fact);//informa el factorial
		scanner.close();
	}

}
