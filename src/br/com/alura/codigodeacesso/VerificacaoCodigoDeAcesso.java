package br.com.alura.codigodeacesso;

import java.util.Scanner;

public class VerificacaoCodigoDeAcesso {
    static void main() {
        int codigoAcessoCorreto = 2023;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = ler.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int permissao = ler.nextInt();

        boolean permissaoCorreta = permissao == 1 || permissao == 2 || permissao == 3;
        boolean acessoCorreto = codigoAcessoCorreto == codigoAcesso;

        if (acessoCorreto && permissaoCorreta ) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        }else {
            System.out.print("Acesso Negado. \nMotivo: ");
            if (!(codigoAcesso == codigoAcessoCorreto)) {
                System.out.println("Código de acesso incorreto");
            }if (!acessoCorreto) {
                System.out.println("Permissáo incorreta.");
            }
        }
    }
}
