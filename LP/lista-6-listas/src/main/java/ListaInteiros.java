
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = 1;
        int numMax = 0;
        int numMin = 99;
        int numTotal = 0;

        List<Integer> listaNum = new ArrayList();

        while (n != 0) {
            System.out.println("Digite um número inteiro:");
            n = leitor.nextInt();
            
            if(n!=0){
            listaNum.add(n);
            }
        }

        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) % 2 == 0) {
                System.out.println("Números pares: " + listaNum.get(i));
            }
        }
        System.out.println("----------------------------");

        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) % 2 != 0) {
                System.out.println("Números ímpares: " + listaNum.get(i));
            }
        }
        System.out.println("----------------------------");
        for (int i = 0; i < listaNum.size(); i++) {
            numTotal += listaNum.get(i);
        }
        System.out.println("Soma total: " + numTotal);
        System.out.println("----------------------------");

        for (int i = 0; i < listaNum.size(); i++) {
            if (numMin > listaNum.get(i)) {
                numMin = listaNum.get(i);
            }
        }
        System.out.println("Menor número: " + numMin);
        System.out.println("----------------------------");

        for (int i = 0; i < listaNum.size(); i++) {
            if (numMax < listaNum.get(i)) {
                numMax = listaNum.get(i);
            }
        }
        System.out.println("Maior número: " + numMax);
    }
}
