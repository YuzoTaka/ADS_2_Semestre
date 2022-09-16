package atv1;

import java.util.Scanner;

public class elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Limite de peso do elevador: ");
        double pesoMax = leitor.nextDouble();

        System.out.println("Limite de pessoas no elevador: ");
        int pessoaMax = leitor.nextInt();

        System.out.println("Peso da 1 pessoa: ");
        double peso1 = leitor.nextDouble();

        System.out.println("Peso da 2 pessoa: ");
        double peso2 = leitor.nextDouble();

        System.out.println("Peso da 3 pessoa: ");
        double peso3 = leitor.nextDouble();

        double pesoTotal = peso1+peso2+peso3;

        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + pessoaMax + " pessoas. O peso total no elevador é de " + pesoMax + ", sendo que ele suporta " + pesoTotal + ".");
    }
}
