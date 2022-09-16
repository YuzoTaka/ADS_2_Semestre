/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class VerificarPrimo {
    
    public Boolean verificarPrimo(int numero){
        for (int i = 2; i < numero; i++) {
            if(numero %  i ==0){
                return false;
            }
        }
        return true;
    }
}
