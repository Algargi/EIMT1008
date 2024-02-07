package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int numeroComprobar = 1; numeroComprobar < num; numeroComprobar++) {
            boolean primo = false;
            int contador = 0;
            for (int i = 1; i <= numeroComprobar; i++) {
                if (numeroComprobar % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                lista.add(numeroComprobar);
            }
        }
        int tam = lista.size();
        System.out.print("Los números primos menores que"+num+" son: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
}
