package atv1;

import java.util.Scanner;

public class CalculoMedio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("Olá, " + nome + ". Sua média foi de " + media + ".");
    }
}
