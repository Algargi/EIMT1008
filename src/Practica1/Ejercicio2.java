package Practica1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = sc.nextInt();
        int resto = num % 2;
        int valorSumar = 0;
        int resultado = 1;
//        if (num == 0 || num == 1) {
//            resultado = 1;
//        } else {
            if (resto == 0) {
                valorSumar = 2;
            } else if (resto == 1) {
                valorSumar = 1;
            }
            for (; valorSumar <= num; valorSumar += 2) {
                resultado *= valorSumar;

            }
        //}

        System.out.println(num+"!! = "+resultado);

    }
}
