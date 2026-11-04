package br.com.alura.comparacaonumeros;

import java.util.Scanner;

public class ComparacaoNumeros {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = ler.nextInt();

        ler.close();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais!");
        }else if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior!");
        }else {
            System.out.println("O número " + numero2 + " é maior");
        }
    }
}
