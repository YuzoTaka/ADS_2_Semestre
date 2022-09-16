package atv1;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        double valorProduto = leitor.nextDouble();

        System.out.println("Quantidade de produto: ");
        int qtdProduto = leitor.nextInt();

        System.out.println("Valor pago: ");
        double valorPago = leitor.nextDouble();

        double troco = valorPago - (valorProduto * qtdProduto);

        if (troco >= 0) {
            System.out.println("Seu troco será de R$ " + troco + ".");

        } else {
            System.out.println("Está faltando dinheiro");
        }
    }
}
