package ej23;
import java.util.Scanner;

public class buscar_palabras {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        String [] ciudades = {"madrid", "brasilia", "buenos aires", "berlin", "oslo"};


        System.out.print("Ingrese el nombre de una ciudad para buscar:\t");
        String ciuBus = scanner.nextLine();

        boolean encontrada = false;


        for (String ciudad : ciudades)//for each que recorre todo el string y analiza las palabras si son iguales con equals(Ignore case ignorar las mayusculas)
        {
            if (ciudad.equalsIgnoreCase(ciuBus))
            { 
                encontrada = true;//se utiliza boolean para saber si se encontro la palabra bucada, break para dejar de ejecutar cuando se encontro la palabra
                break;
            }
        }

        if (encontrada) //corrobora si es encontrada o no la palabra y la muestra en pantalla
        {
            System.out.println("La ciudad [" + ciuBus + "] fue encontrada en el arreglo.");
        } else {
            System.out.println("La ciudad [" + ciuBus + "] no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}
