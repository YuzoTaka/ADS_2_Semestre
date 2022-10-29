/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TestePetShop {
    public static void main(String[] args) {
        Pet p1 = new Pet("Bilu", "Cachorro");
        Pet p2 = new Pet("Neve", "Gato");
        Pet p3 = new Pet("Manchado", "Dalmatas");
        Pet p4 = new Pet("Mochi", "Munchkin");
        
        PetShop ps1 = new PetShop("Casa Pet", 5000.0);
        PetShop ps2 = new PetShop("Loja Pet", 4500.0);
        
        ps1.darBanho(p1, 14.40);
        ps2.darBanho(p3, 15.50);
        ps1.darBanho(p2, 15.90, 5.50);
        ps2.darBanho(p4, 19.00, 6.10);
        
        System.out.println(p1);
        System.out.println("========");
        System.out.println(p2);
        System.out.println("========");
        System.out.println(p3);
        System.out.println("========");
        System.out.println(p4);
        System.out.println("========");
        System.out.println(ps1);
        System.out.println("========");
        System.out.println(ps2);
    }
}
