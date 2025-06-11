package ej25;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        int fla;
        boolean flag=true;
        do {
        
        

        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. salir");
       
        System.out.print("seleccione una operación a realizar:\t");
        int opcion = scanner.nextInt();
        System.out.print("ingrese el primer número:\t");
        num1 = scanner.nextDouble();
        System.out.print("ingrese el segundo número:\t");
        num2 = scanner.nextDouble();

        double resultado;

        // Usar switch para realizar la operación deseada 
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("resultado:\t" + resultado);
                System.out.println("desea salir (ingrese 1):\t");
                fla = scanner.nextInt();
                if(fla==1)
                {
                	flag=false;
                }
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("resultado:\t" + resultado);
                System.out.println("desea salir (ingrese 1):\t");
                fla = scanner.nextInt();
                if(fla==1)
                {
                	flag=false;
                }
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("resultado:\t" + resultado);
                System.out.println("desea salir (ingrese 1):\t");
                fla = scanner.nextInt();
                if(fla==1)
                {
                	flag=false;
                }
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("resultado:\t" + resultado);
                } else {
                    System.out.println("no se puede dividir por cero.");
                }
                System.out.println("desea salir (ingrese 1):\t");
                fla = scanner.nextInt();
                if(fla==1)
                {
                	flag=false;
                }
                break;
            case 5:
            	flag=false;
            default:
                System.out.println("Opción inválida.");
        }
        }while(flag==true);

     
        scanner.close();
        
    }
}
