package br.com.alura.parouimpar;

public class ParOuImpar {
    static void main() {
        int valor1 = 7;
        int valor2 = 8;

        if (valor1 % 2  == 0) {
            System.out.println("o número " + valor1 + " é par");
        }else {
            System.out.println("o número " + valor1 + " é ímpar");
        }

        System.out.println();

        if (valor2 % 2  == 0) {
            System.out.println("o número " + valor2 + " é par");
        }else {
            System.out.println("o número " + valor2 + " é ímpar");
        }
    }
}
