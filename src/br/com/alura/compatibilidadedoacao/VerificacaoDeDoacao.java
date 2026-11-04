package br.com.alura.compatibilidadedoacao;

import java.util.Scanner;

public class VerificacaoDeDoacao {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = ler.nextInt();
        System.out.print("Digite o peso do doador (em kg): ");
        double peso = ler.nextDouble();

        if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        }else if (peso < 50){
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar mais de 50kg.");
        }else{
            System.out.println("O doador é compativel.");
        }
        ler.close();
    }
}
