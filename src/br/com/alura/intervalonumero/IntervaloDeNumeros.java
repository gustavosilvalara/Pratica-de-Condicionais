package br.com.alura.intervalonumero;

import java.util.Scanner;

public class IntervaloDeNumeros {
    static void main() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        int solicitado =  ler.nextInt();

        if (solicitado >= 1000 && solicitado <= 5000) {
            System.out.printf("O valor %d, está dentro do intervalo permitido para empréstimo.", solicitado);
        }else{
            System.out.printf("O valor %d, não está dentro do intervalo permitido para empréstimo.", solicitado);
        }

        ler.close();
    }
}
