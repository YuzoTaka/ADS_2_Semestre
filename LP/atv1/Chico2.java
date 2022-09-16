package atv1;

import java.util.Scanner;

public class Chico2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        double salario = leitor.nextDouble();

        System.out.println("Custo com transporte só ida: ");
        double transporte = leitor.nextDouble();
        
        double inss = salario*0.1;
        double ir = salario*0.2;
        double vt = transporte*2*22;
        double desconto = inss+ir+vt;
        double liquido = salario-inss-ir-vt;

        System.out.println("Seu salário bruto é R$" + salario + ", tem um total de R$ " + desconto + " em descontos e receberá um líquido de R$ " + liquido);
    }
    
}
