
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrutasConsole {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        List<String> frutas = new ArrayList();
        frutas.add("BANANA");
        frutas.add("LICHIA");
        frutas.add("ABACAXI");
        frutas.add("MAÇA");
        frutas.add("PERA");
        Boolean isTrue = false;
        
        System.out.println("Digite o nome da fruta:");
        String frutaNome = leitor.next();

        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).equals(frutaNome)) {
                System.out.println("A fruta " + frutaNome + " existe na fila");
            }
        }

        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).equals(frutaNome.toUpperCase())) {
                isTrue = true;
            }
        }

        if (isTrue) {
            System.out.println("Existe a fruta " + frutaNome.toLowerCase() + " na fila");
        } else {
            System.out.println("Não existe a fruta " + frutaNome.toLowerCase() + " na fila");
        }
    }
}
