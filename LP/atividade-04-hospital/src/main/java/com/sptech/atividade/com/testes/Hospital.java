package com.sptech.atividade.com.testes;

/**
 *
 * @author miniguiti
 */
public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos = 0;
    private Integer quantidadeDeHoraExtra = 0;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico == null || valorPago == null) {
            return;
        }
        if (medico.getAtivo() && valorPago > 0.0) {
            medico.setSalario(valorPago);
            quantidadeDePagamentos++;
        }
    }

    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico == null || valorPago == null || horaExtra == null) {
            return;
        }
        if (medico.getAtivo() && valorPago > 0.0 && horaExtra > 0.0) {
            medico.setSalario(valorPago + horaExtra);
            quantidadeDePagamentos++;
            quantidadeDeHoraExtra++;
        }
    }

    public void desligarMedico(Medico medico) {
        if(medico == null){
            return;
        }
        if(medico.getAtivo()){
            medico.setAtivo(false);
        }
    }
}
