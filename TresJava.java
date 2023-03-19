
package SciJava;

import java.util.Scanner;


public class TresJava {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String novaMedia;

        do {
            // informa o nome e as notas do aluno
            System.out.print("Informe o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Insira a nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Insira a nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Insira a nota 3: ");
            double nota3 = scanner.nextDouble();
            System.out.print("Insira a nota 4: ");
            double nota4 = scanner.nextDouble();

            // Calculando a media
            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);
            if (media < 6) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Aprovado!");
            }

            scanner.nextLine();

            // Repete a operação
            System.out.print("Deseja calcular outra média ? (s/n)? ");
            novaMedia = scanner.nextLine();
        } while (novaMedia.equalsIgnoreCase("s"));
    }
}

