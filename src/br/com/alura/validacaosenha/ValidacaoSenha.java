package br.com.alura.validacaosenha;

import java.util.Scanner;

public class ValidacaoSenha {
    static void main() {
        int senha = 123456;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senhaDigitada = ler.nextInt();

        ler.close();

        if (senha == senhaDigitada) {
            System.out.println("Acesso permitido!");
        }else {
            System.out.println("Acesso negado!");
        }

    }
}
