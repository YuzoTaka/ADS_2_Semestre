
import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private String nome;
    private Double faturamento;
    private List<Pet> pets;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
        this.pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return String.format("Nome do PetShop: %s"
                + "\nFaturamento: %.2f"
                + "\nPets: %s", nome, faturamento, pets);
    }

    public void darBanho(Pet pet, Double valor) {

        if (!pets.contains(pet)) {
            pets.add(pet);
        }
        if (valor > 0 && pet != null) {
            Integer qtdVisita = pet.getQtdVisitas();
            Double valorGasto = pet.getValorGastos();

            valorGasto += valor;
            ++qtdVisita;
            faturamento += valor;
            pet.setValorGastos(valorGasto);
            pet.setQtdVisitas(qtdVisita);
        }
    }

    public void darBanho(Pet pet, Double valor, Double valorDesconto) {
        if (!pets.contains(pet)) {
            pets.add(pet);
        }
        if (pet != null && valor > 0 && valorDesconto > 0) {
            Integer qtdVisita = pet.getQtdVisitas();

            Double valorGasto = pet.getValorGastos();
            Double gastoTotal = valor - valorDesconto;

            valorGasto += gastoTotal;
            ++qtdVisita;
            faturamento += valorGasto;
            
            pet.setValorGastos(valorGasto);
            pet.setQtdVisitas(qtdVisita);
        }
    }
}
