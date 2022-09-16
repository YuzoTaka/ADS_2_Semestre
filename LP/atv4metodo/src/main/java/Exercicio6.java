
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author henri
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Boolean inteiro = true;
        Scanner leitor = new Scanner(System.in);
        VerificarPrimo verify = new VerificarPrimo();

        while (inteiro) {
            System.out.println("Insira um número inteiro:");

            int numero = leitor.nextInt();
            if (numero <= 0) {
                inteiro = false;
                break;
            }
            Boolean isPrimo = verify.verificarPrimo(numero);

            if (isPrimo) {
                System.out.println(String.format("O número %d é primo!!", numero));
            } else {
                System.out.println(String.format("O número %d não é primo!!", numero));
            }
        }
    }
}
