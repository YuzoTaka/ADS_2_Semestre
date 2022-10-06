
public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colab1 = new Colaborador();
        Colaborador colab2 = new Colaborador();

        RecursosHumanos rh = new RecursosHumanos();

        colab1.setNome("Felix");
        colab1.setCargo("Estagiário");
        colab1.setSalario(1800.0);
        
        colab2.setNome("David");
        colab2.setCargo("Analista Junior");
        colab2.setSalario(2600.0);
        
        System.out.println("Colaborador 1:");    
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalario: %.2f",
                colab1.getNome(), colab1.getCargo(), colab1.getSalario()));
        
        System.out.println("-------------------------");
        
        System.out.println("Colaborador 2:");    
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalario: %.2f",
                colab2.getNome(), colab2.getCargo(), colab2.getSalario()));
        
        System.out.println("--------------------------");
        
        System.out.println("Promovendo Colaborador 1:");
        rh.promoverColaborador(colab1, "DBA", 1800.0);
        System.out.println("--------------------------");
        
        System.out.println("Promovendo Colaborador 2:");
        rh.promoverColaborador(colab2, "Analista Pleno", 3200.0);
        System.out.println("--------------------------");
        
        System.out.println("Reajustando salário Colaborador 1:");
        rh.reajustarSalario(colab1, 400.0);
        System.out.println("---------------------------");
        
        System.out.println("Colaborador 1:");    
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalario: %.2f",
                colab1.getNome(), colab1.getCargo(), colab1.getSalario()));
        
        System.out.println("-------------------------");
        
        System.out.println("Colaborador 2:");    
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalario: %.2f",
                colab2.getNome(), colab2.getCargo(), colab2.getSalario()));
        
        System.out.println("-------------------------");
        
        System.out.println(String.format("Resumo: \nTotal de promovidos: %d"
                + "\nTotal de salario reajustados: %d",
                rh.getTotalPromovido(), rh.getTotalSalarioReajustado()));
    }
}
