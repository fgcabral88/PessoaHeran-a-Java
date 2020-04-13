
package projetopessoas.professor;

import projetopessoas.pessoa.Pessoa;

public class Professor extends Pessoa{
    
    // Atributos:
    private String especialidade;
    private float salario;
    
    // Gets e Sets:
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    //--------------------------------------------------------------------------
    
    // Método receber aumento:
    public void receberAumento(float aum){
        salario += aum;
    }
    
}
