package Practica1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        int divAnterior = 0;
        int numeroFinal = 0;
        for (int i = 1; i < num; i++) {
            int contadorDiv = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contadorDiv++;
                }
            }
            if(contadorDiv>= divAnterior){
                divAnterior = contadorDiv;
                numeroFinal = i;
            }
        }
        System.out.println("El número con más divisores es "+numeroFinal+" ("+divAnterior+" divisores)");
    }
}
