package br.com.alura.verificacaodiautil;

import java.util.Scanner;

public class VerificacaoDiaUtil {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaSemana =  ler.nextLine();

        if (diaSemana.equalsIgnoreCase("segunda")
                || diaSemana.equalsIgnoreCase("terca")
                ||diaSemana.equalsIgnoreCase("quarta")
                ||diaSemana.equalsIgnoreCase("quinta")
                ||diaSemana.equalsIgnoreCase("sexta")){
            System.out.println(diaSemana + " é um dia útil.");
        }else {
            System.out.println(diaSemana + " não é um dia útil.");
        }
    }
}
