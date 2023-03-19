
package SciJava;

import java.util.Scanner;


public class UmJava {
     public static void main(String[] args) {

        double media;
        double soma = 0;
        int[] numeros = new int[5];
        int contadorPares = 0, contadorImpares = 0;
        int[] numerosPares = new int[numeros.length];
        int[] numerosImpares = new int[numeros.length];
        
        Scanner scanner = new Scanner(System.in);

        // Solicita os numeros ao usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Separa números pares de ímpares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                numerosImpares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        // Imprime os números pares
        System.out.print("Números pares: ");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(numerosPares[i] + ", ");
        }

        // Imprime os números ímpares
        System.out.print("\nNúmeros ímpares: ");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(numerosImpares[i] + ", ");
        }

        // Calcula a média
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        media = soma / numeros.length;

        System.out.println("\nMédia geral: " + media);
    }
}

