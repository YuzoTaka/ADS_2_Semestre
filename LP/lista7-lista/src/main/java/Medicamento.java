/**
 *
 * @author aluno
 */
public class Medicamento {
    private Integer id;
    private String nomeMedicamento;
    private Integer qtdEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento, Integer qtdEstoque, Double valorVenda) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.qtdEstoque = qtdEstoque;
        this.valorVenda = valorVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format("ID: %d \nNome: %s\nQuantidade em estoque: %d\nValor: R$ %.2f\n--------------------",
                id, nomeMedicamento, qtdEstoque, valorVenda);
    }
    
    
}
