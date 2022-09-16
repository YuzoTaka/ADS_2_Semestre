
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculaSM calc = new CalculaSM();
        
        System.out.println("Digite sua renda:");
        double renda = leitor.nextInt();
        
        double sm = calc.calcularSM(renda);
        
        String classe = calc.calcularClasse(sm);
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimos.", sm));
        System.out.println(String.format("Você pertence a classe social %s", classe));
    }
}
