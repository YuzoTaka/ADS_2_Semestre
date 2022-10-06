
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Teste {

    public static void main(String[] args) {

        List<Medicamento> listaMedicamentos = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        Integer opcao = 0;

        while (opcao != 4) {
            System.out.println("----------------------------------------");
            System.out.println("| Opção 1: Cadastrar medicamento       |");
            System.out.println("----------------------------------------");
            System.out.println("| Opção 2: Exibir medicamento          |");
            System.out.println("----------------------------------------");
            System.out.println("| Opção 3: Buscar medicamento por nome |");
            System.out.println("----------------------------------------");
            System.out.println("| Opção 4: Sair                        |");
            System.out.println("----------------------------------------");

            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Id: ");
                Integer id = leitor.nextInt();
                System.out.println("\nNome do medicamento:");
                String nome = leitor.next();
                System.out.println("\nQuantidade no estoque:");
                Integer qtdEstoque = leitor.nextInt();
                System.out.println("\nValor do medicamento:");
                Double valorMedicamento = leitor.nextDouble();
                System.out.println("\nProduto cadastrado com sucesso!");
                listaMedicamentos.add(new Medicamento(id, nome, qtdEstoque, valorMedicamento));
            }
            if (opcao == 2) {
                System.out.println("Medicamento em estoque: ");
                for (Medicamento item : listaMedicamentos) {
                    System.out.println(item);
                }
            }
            if (opcao == 3) {
                Boolean isTrue = false;
                System.out.println("Nome do medicamento para busca:");
                String buscaMed = leitor.next();
                for (Medicamento item : listaMedicamentos) {
                    if (item.getNomeMedicamento().equals(buscaMed)) {
                        System.out.println(item);
                        isTrue = true;
                    }
                }
                if(!isTrue){
                    System.out.println("Medicamento não cadastrado!");
                }
            }
            if (opcao == 4) {
                System.out.println("Obrigado por utilizar!");
            }
        }
    }

}
