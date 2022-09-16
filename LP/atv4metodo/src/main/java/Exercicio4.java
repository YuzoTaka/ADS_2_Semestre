
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo desc = new DescontoProgressivo();
        
        System.out.println("Bem-Vindo ao sistema de desconto progressivo!");
        System.out.println("");
        System.out.println("Digite o valor unitário do produto:");
        double valor = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        int qtd = leitor.nextInt();
        System.out.println("");
        
        double valorFinal = desc.calcularDesconto(valor, qtd);
        
        desc.exibirNotaFiscal(valor, qtd, valorFinal);
        
    }
}
