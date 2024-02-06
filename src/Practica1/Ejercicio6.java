package Practica1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //NO SE, NO QUIERO PENSAR MÁS
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        for (int i = num-1; i >=1 ; i--) {
            boolean cond = false;
            int contadorDivisores = 0;
            for (int j = 1;  j < i;  j++) {
                if (i%j ==0){
                    contadorDivisores++;
                }
            }
        }
    }
}
