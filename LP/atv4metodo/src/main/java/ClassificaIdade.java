/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class ClassificaIdade {
    public void classificaIdade(int idade){
        String faixa;
        if(idade >=0 & idade <=2){
            faixa = "Bebê";
        } else if(idade <=11){
            faixa = "Criança";
        } else if(idade<=19){
            faixa = "Adolescente";
        } else if(idade<=30){
            faixa = "Jovem";
        } else if(idade <=60){
            faixa = "Adulto";
        } else{
            faixa = "Idoso";
        }
        System.out.println(String.format("Você é %s.", faixa));
    }
}
