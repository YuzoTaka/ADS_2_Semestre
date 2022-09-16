
import java.util.Scanner;

public class Pizzaria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mussarela = 0;
        int calabresa = 0;
        int quaqueijo = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;

        for (int i = 0; i <= 10; i++) {

            System.out.println("Escolha seu sabor favorito: ");
            System.out.println("Mussarela(vote 5) | Calabresa(vote 25) | Quarto queijos(vote 50)");
            int voto = leitor.nextInt();

            if (voto == 5) {
                mussarela += voto;
            }
            if (voto == 25) {
                calabresa += voto;
            }
            if (voto == 50) {
                quaqueijo += voto;
            } else {
                System.out.println("Insira um voto válido...");
            }
        }
        voto1 = mussarela / 5;
        voto2 = calabresa / 25;
        voto3 = quaqueijo / 50;

        System.out.println("Pizza de Mussarela: " + voto1 + " votos");
        System.out.println("Pizza de Calabresa: " + voto2 + " votos");
        System.out.println("Pizza de Quatro Queijo: " + voto3 + " votos");

        if (voto1 > voto2 && voto2 > voto3) {
            System.out.println("Pizza de Mussarela foi a mais votada");
        }
        if (voto2 > voto1 && voto1 > voto3) {
            System.out.println("Pizza de Calabresa foi a mais votada");
        }
        if (voto3 > voto1 && voto1 > voto2) {
            System.out.println("Pizza de Quatro Queijo foi a mais votada");
        }
    }
}
