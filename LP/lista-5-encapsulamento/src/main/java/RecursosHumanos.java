
public class RecursosHumanos {
    private int totalPromovido = 0;
    private int totalSalarioReajustado = 0;

    public int getTotalPromovido() {
        return totalPromovido;
    }

    public int getTotalSalarioReajustado() {
        return totalSalarioReajustado;
    }
    
    
    void reajustarSalario(Colaborador colab, Double reajuste){
        Double salarioAtual = colab.getSalario();
        if(reajuste>0){
        colab.setSalario(salarioAtual + reajuste);
        totalSalarioReajustado++;
            System.out.println("Operação concluída");
        }else{
            System.out.println("Operação inválida...");
        }
    }
    
    void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario){
        Double salarioAtual = colab.getSalario();
        if(novoSalario>salarioAtual){
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
            totalPromovido++;
            System.out.println("Operação concluída");
        }else{
            System.out.println("Operação inválida...");
        }
    }
}
