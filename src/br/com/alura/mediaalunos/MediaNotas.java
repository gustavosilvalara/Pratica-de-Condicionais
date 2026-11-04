package br.com.alura.mediaalunos;

public class MediaNotas {
    static void main() {
        double nota1 = 7;
        double nota2 = 4;
        double nota3 = 1;

        double media = (nota1 + nota2 + nota3) / 3;
        if(media >= 7) {

            System.out.printf("O estudante teve média %.1f e foi aprovado. ", media);

        } else if (media >= 5) {

            System.out.printf("O estudante teve média %.1f e está de recuperação. ", media);

        }else {

            System.out.printf("O estudante teve média %.1f e foi reprovado.", media);

        }

    }
}
