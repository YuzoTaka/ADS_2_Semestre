
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        System.out.println("Fim da execução");

    }
}
