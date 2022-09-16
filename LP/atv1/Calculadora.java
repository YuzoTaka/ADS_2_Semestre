package atv1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = leitor.nextInt();

        System.out.println("Digite um outro número: ");
        int n2 = leitor.nextInt();

        int soma = n1+n2;
        int sub = n1-n2;
        int mult = n1*n2;
        int div = n1/n2; 

        System.out.println("Resultado da soma: " + "\n"+ soma);
        System.out.println("Resultado da subtração: " + "\n"+ sub);
        System.out.println("Resultado da multiplicação: " + "\n" + mult);
        System.out.println("Resultado da divisão: " + "\n" +div);
    }
}
