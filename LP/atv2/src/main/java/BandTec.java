
import java.util.Scanner;

public class BandTec {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean validacao = false;

        while (!validacao) {
            System.out.println("Digite seu usuário: ");
            String usuario = leitor.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = leitor.nextLine();

            if (usuario.equals("admin") && senha.equals("#Bandtec")) {
                System.out.println("Login realizado com sucesso!");
                validacao = true;
                break;
            } else {
                System.out.println("Login e/ou senha inválidos");
                validacao = false;
            }
        }

    }
}
