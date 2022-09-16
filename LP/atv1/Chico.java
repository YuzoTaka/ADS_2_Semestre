package atv1;

import java.util.Scanner;

public class Chico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tempo aquecendo: ");
        int aquecimento = leitor.nextInt();

        System.out.println("Tempo exercício aeróbico: ");
        int aerobico = leitor.nextInt();

        System.out.println("Tempo exercício musculação: ");
        int musculacao = leitor.nextInt();

        int caloria = (aquecimento*12)+(aerobico*20)+(musculacao*25);
        int tempo = aquecimento+aerobico+musculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + tempo + " minutos de exercícios e perdeu cerca de " + caloria + " calorias");
    }
}
