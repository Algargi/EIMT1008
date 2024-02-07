package Practica1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        int primorial = 1;
        for (int numeroComprobar = 1; numeroComprobar <= num; numeroComprobar++) {
            if (esPrimo(numeroComprobar)) {
                primorial*=numeroComprobar;
            }
        }
        System.out.print(num+"# = "+primorial);
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
