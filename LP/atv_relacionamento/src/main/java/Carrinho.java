
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author henri
 */
public class Carrinho {

    private String cliente;

    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Integer getQuantidade() {
        Integer qtdTotal = produtos.size();
        return qtdTotal;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
        System.out.println("Produto adicionado: " + p.getNome());
    }

    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdPorCategoria = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                qtdPorCategoria++;
            }
        }
        return qtdPorCategoria;
    }

    public void limpar() {
        produtos.clear();
        System.out.println("Lista de produtos zerada");
    }

    public void removerPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(nome);
                System.out.println(String.format("Produto %s removido", nome));
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("\nCliente: %s\nProdutos: %s", cliente, produtos);
    }

}
