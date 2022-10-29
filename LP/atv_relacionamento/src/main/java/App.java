
public class App {

    public static void main(String[] args) {
        Produto p1 = new Produto("Bolacha Maizena", "Bolacha", 7.50);
        Produto p2 = new Produto("Doritos", "Salgadinho", 9.90);
        Produto p3 = new Produto("Monster", "Energético", 10.10);
        Produto p4 = new Produto("Amendoim", "Salgadinho", 8.60);

        Carrinho c1 = new Carrinho("Carrefour");
        Carrinho c2 = new Carrinho("Extra");

        c1.adicionar(p1);
        c1.adicionar(p2);

        c2.adicionar(p3);
        c2.adicionar(p4);

        System.out.println("\nQuantidade de produtos no carrinho1: " + c1.getQuantidade());
        System.out.println("\nQuantidade de produtos no carrinho2: " + c2.getQuantidade());
        
        String produto1 = "Doritos";
        String produto2 = "Oreo";
        if (c1.existsPorNome(produto1)) {
            System.out.println("\nExiste na lista o produto: " + produto1);
        } else {
            System.out.println("\nNão existe na lista o produto: " + produto1);
        }
        
        if (c2.existsPorNome(produto2)) {
            System.out.println("\nExiste na lista o produto: " + produto2);
        } else {
            System.out.println("Não existe na lista o produto: " + produto2);
        }

        System.out.println("\nCategoria " + c1.getCliente() + ": " + c1.getQuantidadePorCategoria("Bolacha"));
        System.out.println("\nCategoria " + c2.getCliente() + ": " + c2.getQuantidadePorCategoria("Bebidas"));

        c2.limpar();

        c1.removerPorNome("Doritos");

        System.out.println(c1.getPorNome("Bolacha Maizena"));

        System.out.println(String.format("\nValor total: %.2f", c1.getValorTotal()));
    }
}
