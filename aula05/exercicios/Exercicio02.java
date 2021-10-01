package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_ALUNOS = 3;
        final int NUMERO_TURMAS = 2;
        double mediaAluno, mediaTurma, mediaGeral;

        mediaGeral = 0;
        for (int turma = 1; turma <= NUMERO_TURMAS; turma++){
        // resolver por partes
        mediaTurma = 0;
        for (int alunos=1; alunos < NUMERO_ALUNOS; alunos++) {
                System.out.println("Informe a media do aluno " + alunos);
                mediaAluno = entrada.nextInt();
                mediaTurma += mediaAluno;
            }
            mediaTurma /= NUMERO_ALUNOS;
            System.out.println("Média da turma: " + mediaTurma);

            mediaGeral += mediaTurma;
        }
        mediaGeral /= NUMERO_TURMAS;
        System.out.println("Media geral: " + mediaGeral);

        entrada.close();
    }
}
