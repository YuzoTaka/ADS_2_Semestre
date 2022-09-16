package atv1;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        int anoNasc = leitor.nextInt();

        System.out.println("Em 2030 você terá " + (2030-anoNasc) + " anos");
    }
}
