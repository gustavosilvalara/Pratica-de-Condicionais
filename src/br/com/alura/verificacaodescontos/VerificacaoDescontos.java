package br.com.alura.verificacaodescontos;

import java.util.Scanner;

public class VerificacaoDescontos {
    static void main() {
        Scanner ler = new Scanner(System.in);
        int desconto = 10;

        System.out.print("Digite o valor da compra: ");
        double valor =  ler.nextInt();
        ler.close();

        if (valor > 100) {
            double valorDescontado = valor - (valor * ((double)desconto / 100));
            System.out.println("Desconto de " + desconto + "% aplicado.");
            System.out.printf("Novo valor: R$: %.2f", valorDescontado);
        }else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: %.2f", valor);
        }


    }
}
