
package projetopessoas.funcionarios;

import projetopessoas.pessoa.Pessoa;

public class Funcionario extends Pessoa{
    
    // Atributos:
    private String setor;
    private boolean trabalhando;

    // Gest e Sets:
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //--------------------------------------------------------------------------
    
    // Método muda trabalho:
    public void mudaTrabalho(){
        trabalhando = !trabalhando;
    }
}
