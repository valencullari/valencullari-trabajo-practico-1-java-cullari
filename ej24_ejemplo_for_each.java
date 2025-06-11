package ej24;
import java.util.Scanner;

public class ejemplo_for_each {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	int contador = 0;
        int num;
   
        System.out.print("cuantos nombres desea ingresar:\t");
        num=scanner.nextInt();
        scanner.nextLine();//limpia el scanner para que pueda ser usado abajo en el pedido de nombres y no se trabe
 
        String[]nom= new String[num];

        for (int i=0;i<num;i++)
        {
            System.out.print("Ingrese el nombre " +(i+1) + ":\t");
            nom[i]=scanner.nextLine();
        }

        
        for (String nombre : nom) //for each que recorre el string para saber si el nombre arranca con a
        {
            if (nombre.toLowerCase().startsWith("a")) {
                contador++;
            }
        }


        System.out.println("Hay [" + contador+"] nombres que empiezan por A");

        scanner.close();
    }
}
