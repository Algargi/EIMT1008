package Practica1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        long factorial =1;
        for (int i=1; i<=num;i++){
            factorial*= i;
        }
        System.out.println(num+"! "+" = "+factorial);
    }
}
