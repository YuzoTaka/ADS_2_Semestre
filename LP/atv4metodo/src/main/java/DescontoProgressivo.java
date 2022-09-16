/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class DescontoProgressivo {
    
    public double calcularDesconto(double valor, int qtd){
        double desconto = 0;
        if(qtd == 1){
            desconto = 0.9;
        }else if(qtd == 2){
            desconto = 0.8;
        }else{
            desconto = 0.7;
        }
        double valorFinal = (valor*qtd)*desconto;
        return valorFinal;
    }
    
    public void exibirNotaFiscal(double valor, int qtd, double valorFinal){
        System.out.println("--------------------------------------------");
        System.out.println(String.format("Valor do produto: R$%.1f", valor));
        System.out.println(String.format("Quantidade: %d", qtd));
        System.out.println("--------------------------------------------");
        System.out.println(String.format("Valor com desconto: R$%.2f", valorFinal));
        
    }
}
