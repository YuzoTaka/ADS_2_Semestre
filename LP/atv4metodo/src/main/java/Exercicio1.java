
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nota 1: ");
        double n1 = leitor.nextDouble();
        
        System.out.println("Nota 2: ");
        double n2 = leitor.nextDouble();
        
        CalcularMedia calc = new CalcularMedia();
        
        double media = calc.CalcularMedia(n1, n2);
        
        System.out.println(String.format("Sua média é de %.1f", media));
    }
    
}
