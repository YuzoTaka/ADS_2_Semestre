
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGastos;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGastos = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorGastos() {
        return valorGastos;
    }

    public void setValorGastos(Double valorGastos) {
        this.valorGastos = valorGastos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s"
                + "\nRaça: %s"
                + "\nQuantidade de visitas: %d"
                + "\nValor gasto: %.2f",
                nome, raca, qtdVisitas, valorGastos);
    }
    
    
}
