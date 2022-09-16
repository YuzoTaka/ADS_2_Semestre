/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class CalculaSM {
    
    public double calcularSM(double renda){
        double sm = renda/1100;
        return sm;
    }
    
    public String calcularClasse(double sm){
        if(sm<=2){
            String classe = "E";
            return classe;
        }else if(sm<=4){
            String classe = "D";
            return classe;
        }else if(sm<=10){
            String classe = "C";
            return classe;
        }else if(sm<=20){
            String classe = "B";
            return classe;
        }else if(sm>20){
            String classe = "A";
            return classe;
        }
    }
}
