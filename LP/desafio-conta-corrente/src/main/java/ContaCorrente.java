
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> historicos;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historicos = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s"
                + "\nSaldo: %.2f"
                + "\nHistórico: %s",
                titular, saldo, historicos);
    }

    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0 && dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && ano >= 2000 && ano <= 2022) {
            saldo += valor;
            Historico hist = new Historico(dia, mes, ano, valor, "Deposito");
            historicos.add(hist);
        }
    }

    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0 && saldo >= valor && dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && ano > 2000 && ano <= 2022) {
            saldo -= valor;
            Historico hist = new Historico(dia, mes, ano, valor, "Saque");
            historicos.add(hist);
        }
    }

    public void exibirExtrato(){
        System.out.println(historicos);
    }
}
