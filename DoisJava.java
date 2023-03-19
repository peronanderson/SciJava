
package SciJava;

import java.util.Scanner;


public class DoisJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Solicita números ao usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Encontra o maior e o menor número
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}