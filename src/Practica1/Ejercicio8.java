package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int numeroComprobar = 1; numeroComprobar < num; numeroComprobar++) {
            if (esPrimo(numeroComprobar)) {
                lista.add(numeroComprobar);
            }
        }
        System.out.print("Los números primos menores que "+num+" son: ");
        for (int i : lista) {
            System.out.print(i + " ");
        }
    }
    public static boolean esPrimo(int num){
        int contador = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0 ){
                contador++;
            }
        }
        return contador == 2;
    }
}
