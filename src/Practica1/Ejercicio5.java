package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        int primorial = 1;
        for (int numeroComprobar = 1; numeroComprobar <= num; numeroComprobar++) {
            boolean primo = false;
            int contador = 0;
            for (int i = 1; i <= numeroComprobar; i++) {
                if (numeroComprobar % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                primorial*=numeroComprobar;
            }
        }
        System.out.print(num+"# = "+primorial);
        }
    }


