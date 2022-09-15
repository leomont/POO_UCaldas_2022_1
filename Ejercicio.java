//package arreglos;

import java.util.Scanner;

public class Ejercicio {

    // Crear un programa que reciba por consola 10 numero 
    // y en la consola muestre solamente los numeros pares
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];

        System.out.println("Ingrese los 10 numero a analizar: ");
        int contador = 0;
        for (int indice = 0; indice < 10; indice++) {
            int numero = scanner.nextInt();
            numeros[indice] = numero;

            if (numeros[indice] % 2 == 0) {
                pares[contador] = numeros[indice];
                contador++;
            }

        }

        System.out.println("Los numero pares son: ");
        for (int indice = 0; indice < contador; indice++) {
            System.out.println(pares[indice]);
        }

    }

}
