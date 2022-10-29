/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente CC1 = new ContaCorrente("Yuzo");
        ContaCorrente CC2 = new ContaCorrente("Michelle");
        ContaCorrente CC3 = new ContaCorrente("Felix");
        
        CC1.depositar(50.00, 25, 10, 2022);
        CC2.depositar(350.00, 22, 8, 2022);
        CC3.depositar(150.00, 22, 2, 2020);
        
        CC1.sacar(20.50, 21, 10, 2021);
        CC2.sacar(120.00, 24, 11, 2021);
        CC3.sacar(220.50, 22, 9, 2021);
        
        CC1.exibirExtrato();
        System.out.println("===========");
        CC2.exibirExtrato();
        System.out.println("===========");
        CC3.exibirExtrato();
        
    }
}
