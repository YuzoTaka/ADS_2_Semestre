
import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int total = 1;
        System.out.println("Digite o número da base: ");
        int base = leitor.nextInt();

        System.out.println("Digite o número do expoente: ");
        int expoente = leitor.nextInt();

        for (int i = 1; i <= expoente; i++) {
            total *=  base;
        }
        System.out.println(total);
    }
}
