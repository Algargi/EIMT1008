package Practica1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        System.out.println(esPrimo(num));

    }
    public static boolean esPrimo(int num){
        int contador = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0 ){
                contador++;
            }
        }
        return contador == 2 ? true : false;
    }
}
