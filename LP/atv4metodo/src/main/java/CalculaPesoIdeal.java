/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class CalculaPesoIdeal {
    public void calculaPesoIdeal(String sexo, double altura){
        double pesoIdeal;
        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura)-58;
            System.out.println(String.format("Peso ideal: %.2f Kg", pesoIdeal));
        }
        if(sexo.equals("F")){
            pesoIdeal = (62.1 * altura)-55.7;
            System.out.println(String.format("Peso ideal: %.2f Kg", pesoIdeal));
        }
    }
}
