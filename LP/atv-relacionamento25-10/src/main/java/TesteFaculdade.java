/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("168", "Felix", 2);
        Aluno a2 = new Aluno("017", "Yuzo", 2);
        Aluno a3 = new Aluno("470", "Roberto", 4);
        Aluno a4 = new Aluno("200", "Michelle", 3);
        
        Faculdade f1 = new Faculdade("SPTech");
        Faculdade f2 = new Faculdade("Maua");
        
        f1.matricularAluno(a1);
        f1.matricularAluno(a3);
        f2.matricularAluno(a2);
        f2.matricularAluno(a4);
        
        f1.cancelarMatricula("168");
        
        f2.exibirAluno();
        
        f1.exibirAlunoPorSemestre(4);
        
        f1.exibirAluno();
    }
}
