
package SciJava;

import java.util.Scanner;


public class QuatroJava {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("O valor apresentado na posição 3 é: " + vetor[2]);
        
    }
}