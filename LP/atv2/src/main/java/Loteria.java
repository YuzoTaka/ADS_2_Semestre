
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Boolean validacao = false;
        int tent = 0;

        while (validacao == false) {
            System.out.println("Digite um número entre 0 e 10: ");
            int numero = leitor.nextInt();

            int rand = ThreadLocalRandom.current().nextInt(0, 10);

            tent++;
            if (numero == rand) {
                if (tent <= 3) {
                    System.out.println("Você é MUITO sortudo");
                }
                if (tent >= 3 && tent <= 10) {
                    System.out.println("Você é sortudo");
                }
                if (tent > 10) {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                }
                break;
            } else {
                System.out.println("Tentativas: " + tent);
            }
        }
    }
}
