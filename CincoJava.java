
package SciJava;

import java.util.Scanner;


public class CincoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] alunos = new String[3][5];
        double[] medias = new double[3];
        double maiorMedia = 0, menorMedia = 10;
        String nomeMaiorMedia = "", nomeMenorMedia = "";
        
        
        //primeiro "for" informa o nome,segundo "for" informa as notas 
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i+1) + ":");
            System.out.print("Digite o nome: ");
            alunos[i][0] = sc.nextLine();
            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a " + j + "ª nota: ");
                alunos[i][j] = sc.nextLine();
                medias[i] += Double.parseDouble(alunos[i][j]);
            }
            medias[i] /= 4;
            System.out.println("Média: " + medias[i]);
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                nomeMaiorMedia = alunos[i][0];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                nomeMenorMedia = alunos[i][0];
            }
        }
        
        System.out.println("Aluno com a maior média: " + nomeMaiorMedia);
        System.out.println("Aluno com a menor média: " + nomeMenorMedia);
        
    }
}
