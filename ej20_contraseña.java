package ej20;
import java.util.Random;
import java.util.Scanner;

public class contraseña {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lon= 0;

        int num=1234567890;
        String min = "qwertyuiopasdfghjklzxcvbnm";//strings y int para tener todos los valores posibles para la contraseña
		String may = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String total=min+num+may;
        String contra = " ";


        System.out.print("Ingrese una longitud para su contrasena: ");
        lon = scanner.nextInt();

        for(int i = 0; i < lon; i++) //for que genera un valor random entre todos los anteriores y forma los almacena en una variable contra, genera la misma cantidad que ingresa el usuario
        {

            char c= total.charAt(random.nextInt(total.length())); 
            contra += c; 

        }

        System.out.print("La contrasena generada es: " + contra);
        scanner.close();
    }

}
