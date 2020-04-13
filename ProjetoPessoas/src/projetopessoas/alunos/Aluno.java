
package projetopessoas.alunos;

import projetopessoas.pessoa.Pessoa;

public class Aluno extends Pessoa{
    
    // Atributos:
    private int matricula;
    private String curso;

    
    // Gets e Sets:
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //--------------------------------------------------------------------------
    
    // Método cancelar matricula:
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }
    
    // Método pagar mensalidade:
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno: " + nome);
    }    
}
