package com.calculator;

import java.io.IOException;
import java.util.Scanner;

public class AppForCalculating {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion = 5;
        do{
            try {
                Runtime.getRuntime().exec("printf \"\\033c\"");
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            System.out.print("Ingrese primer numero(Solo numero enteros): ");
            Integer numero1 = scanner.nextInt();
            System.out.print("Ingrese segundo numero(Solo numero enteros): ");
            Integer numero2 = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("El producto es: " + (numero1 * numero2));
                    break;
                case 4:
                    if(numero2 != 0){
                        System.out.println("El cociente es: " + (Double.valueOf(numero1) / Double.valueOf(numero2)));
                        System.out.println("Con resto: " + (numero1 % numero2));
                    }else{
                        System.out.println("No se puede dividir por 0!!!");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar la aplicacion - cualquier consulta a mail@mail.com");
                    break;
                default:
                    System.out.println("Opcion no existente!!");
            }
        }while(opcion != 5);
    }

}
