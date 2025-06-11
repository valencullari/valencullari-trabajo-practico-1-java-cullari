package ej15;
import java.util.Scanner;

public class cajero_automatico {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		int saldo=1000,num,opc;
		System.out.println("Buenos dias bienvenido a el banco triple P\n Pachu, Pichu y Pocho, pucha que vale la pena");
		do {
		System.out.println("\n1. Consultar saldo");
		System.out.println("2. Retirar efectivo");
		System.out.println("3. Depositar efectivo");
		System.out.println("4. Salir");
		System.out.print("Ingrese una opcion:\t");//pide una opcion para ejecutar en el switch
		opc=scanner.nextInt();
		switch(opc)
		{
		case 1:
			System.out.println("Saldo restante:\t"+saldo);//opcion consultar saldo
			break;
		case 2:
			do {
			System.out.print("Cuanto efectivo va a retirar:\t");//opcion retirar saldo si es que tiene 
			num=scanner.nextInt();
			}while(num<saldo);
			saldo-=num;
			break; 
		case 3:
			System.out.print("Cuanto efectivo va a depositar:\t");//depositar efectivo
			num=scanner.nextInt();
			saldo+=num;
			break;
		case 4:
			System.out.print("saliendo del programa");
			break;
		default:
			System.out.println("ingrese una opcion elegible: ");
		}
		}while(opc!=4);//corrobora que ponga una opcion que no sea 4 y vuelve a ejecutar el switch
		
		scanner.close();

	}

}
