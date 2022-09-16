
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClassificaIdade clas = new ClassificaIdade();
        
        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        
        clas.classificaIdade(idade);
    }
}
