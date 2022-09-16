package atv1;

import java.util.Scanner;

public class CadastroUsuario{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Login: ");
        String login = leitor.nextLine();

        System.out.println("Senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Vezes de erro: ");
        int erro = leitor.nextInt();

        System.out.println("Seu login é " + login + " e sua senha é " + senha +". Você tem " + erro + " tentativas antes de ser bloqueado");
    }
}