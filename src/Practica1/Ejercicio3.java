package Practica1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        boolean primo = false;
        int contador = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            primo = true;
        }

        if(primo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

    }
}
