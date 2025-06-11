package ej13;
import java.util.Scanner;

public class conversion_grados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int  opc,grados,gra;
		do {
		System.out.println("1. Conversion grados Celsius a Fahrenheit");
		System.out.println("2. Conversion grados Fahrenheit a Celsius");
		System.out.print("ingrese la opcion a ejecutar: ");
		opc=scanner.nextInt();//pide una opcion 
		switch(opc)
		{
		case 1://conversion de celsius a Fahrenheit
			System.out.print("ingrese los grados Celsius:	");
			grados=scanner.nextInt();
			gra=9/5*grados + 32;//
			System.out.print("\n"+grados+"° grados Celsius equivalen a ["+gra+"°+] Fahrenheit");
			break;
		case 2://conversion de Fahrenheit a celsius
			System.out.print("ingrese los grados Fahrenheit:	");
			grados=scanner.nextInt();
			gra=(grados-32)*5/9;
			System.out.print("\n"+grados+"° grados Fahrenheit equivalen a ["+gra+"°] grados Celsius");
			break;
		default:
			System.out.println("ingrese una opcion elegible: ");//
		}
		}while(opc!=2 &&opc!=1);
		
		scanner.close();
	}

}
