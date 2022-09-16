
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean validacao = false;
        int par = 0;
        int impar = 0;

        System.out.println("Digite um número entre 1 e 100: ");
        int numero = leitor.nextInt();

        while (!validacao) {
            int rand = ThreadLocalRandom.current().nextInt(1, 100);
            if (rand % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            System.out.println(rand);
            if (numero == rand) {
                System.out.println("Você venceu!!");
                validacao = true;
                break;
            }
        }
        System.out.println("Número de pares sortidos: " + par);
        System.out.println("Número de impares sortidos: " + impar);

    }
}
