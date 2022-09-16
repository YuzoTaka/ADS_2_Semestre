package atv1;

import java.util.Scanner;

public class Quisito {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qtd de filhos com idade entre 0 e 3: ");
        int filho1 = leitor.nextInt();

        System.out.println("Qtd de filhos com idade entre 4 e 16: ");
        int filho2 = leitor.nextInt();

        System.out.println("Qtd de filhos com idade entre 17 e 18: ");
        int filho3 = leitor.nextInt();

        double bolsa = (filho1 * 25.12) + (filho2 * 15.88) + (filho3 * 12.44);
        int qtdFilho = filho1 + filho2 + filho3;

        System.out.println("Você tem um total de " + qtdFilho + " filhos e vai receber R$" + bolsa + " de bolsa");
    }
}
