package ej21;
import java.util.Scanner;

public class for_each {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String str="4127561759";
		int num,cont=0;
		
		System.out.println(str);
		System.out.println("ingrese un numero para contar cuantos digitos son mayores a ese:");
		num=scanner.nextInt();
		
		for(char letra: str.toCharArray())//for each recorre la longitud del array y cada vez que num es menor que un valor del string se le suma uno al contador 
		{
			if(num<Character.getNumericValue(letra))
			{
				cont++;
			}
		}
		System.out.println("hay ["+cont+"] mayores a "+num);
		
		scanner.close();
	}
	

}
