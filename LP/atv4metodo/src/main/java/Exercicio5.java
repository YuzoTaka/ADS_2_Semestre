
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculaPesoIdeal calc = new CalculaPesoIdeal();
        
        System.out.println("Digite o sexo(M/F):");
        String sexo = leitor.next();
        System.out.println("");
        System.out.println("Digite sua altura:");
        double altura = leitor.nextDouble();
        
        calc.calculaPesoIdeal(sexo, altura);
    }
}
